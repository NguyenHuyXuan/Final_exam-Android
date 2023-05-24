package com.hktstudio.music.storage;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.firestore.core.FirestoreClient;

import java.io.FileInputStream;
import java.io.InputStream;

public class FirebaseStorage {
    FirebaseApp.initializeApp();

    // Use the application default credentials
    GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();
    FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(credentials)
            .setProjectId(projectId)
            .build();
    FirebaseApp.initializeApp(options);

    Firestore db = FirestoreClient.getFirestore();

    InputStream serviceAccount = new FileInputStream("path/to/firebase-adminsdk-9v6tw@music-bcf2f.iam.gserviceaccount.com.json");
    GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
    FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(credentials)
            .build();
    FirebaseApp.initializeApp(options);

    Firestore db = FirestoreClient.getFirestore();

}
