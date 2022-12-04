# AOP-Aspect-Oriented-Programming-with-AspectJ
<br>
Cette application permet de gérer des comptes bancaires stockés en mémoire dans une collection de type Map.<br> 
Chaque compte est défini par son code et son solde.<br><br>
▸Les exigences fonctionnelle de l’application sont:<br>
&ensp;&ensp;&ensp;&ensp;• Ajouter un compte<br>
&ensp;&ensp;&ensp;&ensp;• Consulter un compte<br>
&ensp;&ensp;&ensp;&ensp;• Verser un montant dans un compte<br>
&ensp;&ensp;&ensp;&ensp;• Retirer un montant d’un compte<br><br>
▸Les exigences techniques seront implémentées sous
formes d’aspects suivants:<br>
&ensp;&ensp;&ensp;&ensp;• Un aspect pour la journalisation des appels de toutes
les méthodes en affichant la durée d’exécution de
chaque méthode <br>
&ensp;&ensp;&ensp;&ensp;• Un aspect pour contrôler le montant du retrait <br>
&ensp;&ensp;&ensp;&ensp;• Un aspect pour sécuriser l’application <br>
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/205504276-8bcab1dd-759f-4233-a9ae-d2f050c3f658.png" width="450" height="400"/> 
</p>
<br>

## Configuration de projet

Comme première étape il faut créer un projet Maven, et ajouter la dépendance suivante dans le fichier pom.xml<br><br>
![image](https://user-images.githubusercontent.com/63150702/205515278-14a6de8a-cdcb-443f-8875-e38ff5fcf1bd.png)

Par la suite il faut partir au structure de projet à partir le menu en haut et ajouter une facet :<br><br>
![image](https://user-images.githubusercontent.com/63150702/205515342-b24a509d-cee4-41e3-8506-a98bbab05d0f.png)

Maintenant on a la possibilité de créer un aspect :<br><br>
![image](https://user-images.githubusercontent.com/63150702/205515564-0800e52f-e7cc-4e1b-ad01-cd9630d4b813.png)

## Implémentation de projet
Lien de la vidéo sur Youtube de Professeur Mr YOUSSFI Mohamed pour implémenter ce projet : <br>
https://www.youtube.com/watch?v=8dPXOKR3AN8
