# 🎶 Java Music Player — Lecteur Audio Console

> Un lecteur audio en ligne de commande, léger et sans dépendances externes, propulsé par l'API native `javax.sound.sampled` de Java.

<p align="center">
  <img src="https://img.shields.io/badge/Java-JDK%2017%2B-ED8B00?logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/API-javax.sound.sampled-blue" alt="javax.sound.sampled">
  <img src="https://img.shields.io/badge/Interface-Console-black" alt="Console">
  <img src="https://img.shields.io/badge/Status-Educational-informational" alt="Status">
  <img src="https://img.shields.io/badge/License-Not%20specified-lightgrey" alt="License">
</p>

---

## 📌 Aperçu du projet

**Java Music Player** est un lecteur audio minimaliste fonctionnant entièrement en console, développé en Java pur avec la bibliothèque standard `javax.sound.sampled` — sans framework ni dépendance tierce. Il permet de **jouer, arrêter et rejouer** des fichiers `.wav` via des commandes clavier simples, illustrant une manipulation propre des flux audio et de la gestion d'événements en Java.

Ce projet s'adresse aux **développeurs souhaitant démontrer leur maîtrise des API bas niveau de Java** (audio, threads, I/O) dans un contexte de portfolio technique.

---

## ✨ Fonctionnalités clés

- ▶️ **Lecture** d'un fichier `.wav`
- ⏸️ **Arrêt** de la lecture en cours
- 🔁 **Reprise depuis le début** (replay)
- ❌ **Sortie propre** du programme
- 🖥️ Interface console claire et intuitive, pilotée par commandes clavier

---

## 🏗️ Architecture & Stack Technique

| Composant | Technologie | Rôle |
|---|---|---|
| **Langage** | Java (JDK 17+) | Logique applicative |
| **Audio** | `javax.sound.sampled` (API native Java) | Lecture/contrôle des fichiers `.wav` |
| **Interface** | Console (CLI) | Interaction utilisateur via clavier |
| **IDE** | IntelliJ IDEA (fichiers `.idea`, `.iml`) | Environnement de développement |

---

## 🚀 Guide d'installation & Démarrage rapide

### Prérequis
- JDK 17 ou version supérieure supportant `javax.sound.sampled`
- Un fichier audio au format `.wav`

### 1️⃣ Cloner le projet
```bash
git clone https://github.com/ELGHAD/Music_Player.git
cd Music_Player
```

### 2️⃣ Placer votre fichier audio
Déposez votre fichier `.wav` dans le dossier `src/` (ex. `src/A.wav`).

### 3️⃣ Vérifier le chemin du fichier dans le code
```java
String filePath = "src/A.wav";
```

### 4️⃣ Compiler le programme
```bash
javac MusicPlayer.java
```

### 5️⃣ Lancer le lecteur
```bash
java MusicPlayer
```

### 🎮 Contrôles disponibles

| Touche | Action |
|---|---|
| `P` | ▶️ Play |
| `S` | ⏸️ Stop |
| `R` | 🔁 Replay |
| `Q` | ❌ Quit |

---

## 🧠 Exemple d'exécution

```
🎶 Welcome to Simple Music Player 🎶

✅ Audio file loaded successfully!

🎛️ Available Controls:
[P] ▶️ Play
[S] ⏸️ Stop
[R] 🔁 Replay
[Q] ❌ Quit
👉 Enter your choice: P
▶️ Playing...
```

---

## 📁 Structure du projet

```
Music_Player/
├── src/
│   ├── MusicPlayer.java   # Classe principale : lecture/contrôle audio
│   └── A.wav              # Fichier audio d'exemple
├── .gitignore
└── README.md
```

---

## 🔒 Bonnes pratiques

- Utilisation exclusive de l'**API standard Java** (aucune dépendance externe), garantissant portabilité et légèreté.
- Gestion explicite du cycle de vie du flux audio (`Clip`, `open`, `stop`, `close`).
- Interface utilisateur simple facilitant la lecture et la maintenance du code.

---

## 👤 Auteur & Contact

**ELGHAD**
- GitHub : [@ELGHAD](https://github.com/ELGHAD)
- Projet : [Music_Player](https://github.com/ELGHAD/Music_Player)

⭐ Si ce projet vous plaît, laissez une étoile ou proposez vos améliorations via une *pull request* !
