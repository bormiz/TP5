/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp5ex1;

/**
 *
 * @author aziz
 */
public class Tp5ex1 {

   public static void main(String[] args) {
ClassificationDataset classificationData = new ClassificationDataset(
"chemin/vers/classification_data.csv", true);
RegressionDataset regressionData = new RegressionDataset(
"chemin/vers/regression_data.csv", false);
2SupportVectorMachine svm = new SupportVectorMachine("SVM", 1, 0.01);
svm.train(classificationData);
svm.displayDetails();
RandomForest rf = new RandomForest("RandomForest", 100, 10);
rf.train(regressionData);
rf.displayDetails();
NeuralNetwork nn = new NeuralNetwork("NeuralNetwork", new int[]{10, 5, 1}, "sigmoid");
nn.train(classificationData);
nn.displayDetails();
System.out.println("Prédiction SVM : " + svm.predict(classificationData));
System.out.println("Prédiction RandomForest : " + rf.predict(regressionData));
System.out.println("Prédiction NeuralNetwork : " + nn.predict(classificationData));
}
}