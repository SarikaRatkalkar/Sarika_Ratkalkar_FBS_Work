//Player Management System
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Player{
	int jnumber;
	char name[20];
	int runs;
	int wickets;
	int matches;
}Player;
void add(Player*, int*);
void removeplayer(Player*, int*);
void search(Player*, int*);
void update(Player*, int*);
void sort(Player*, int*);
void display(Player*, int*);
void top3(Player*, int*);

int main()
{
	int size;
    int pcount=0;
    printf("\t==============================\n");
    printf("\t  PLAYER MANAGEMENT SYSTEM  \n");
    printf("\t==============================\n");

	while(1){

        printf("\tHow many players you want to add? ");
		if((scanf("%d",&size)) == 1 && size > 0){
			break;}
		else{
			printf("\tInvalid input! Please enter a number\n");
			fflush(stdin);
	    }
    }
	Player *p = (Player*)malloc(sizeof(Player)*size);
	printf("\n");
	while (1){
		printf("\n\t==============================\n");
		printf("\t        MAIN MENU             \n");
		printf("\t==============================\n");
		printf("\t1. Add Player\n");
		printf("\t2. Remove Player\n");
		printf("\t3. Search Player\n");
		printf("\t4. Update Player\n");
		printf("\t5. Display Sorted Players\n");
		printf("\t6. Display All Players\n");
		printf("\t7. Display Top 3 Players\n");
		printf("\t8. Exit Program\n");
		printf("\t==============================\n");
		printf("\n");
		int choice;
		printf("\tEnter your choice:");
		scanf("%d",&choice);
		fflush(stdin);
		printf("\n");
		switch (choice){
			case 1:{
				if(pcount<size){
					add(p, &pcount);
				}
				else{
					printf("\tDo you want to increase the size?\n");
                    printf("\t1.Yes\n");
                    printf("\t2.No\n");
                    int choice;
                    printf("\tEnter your choice: ");
                    scanf("%d", &choice);
                    fflush(stdin);

                    if (choice == 1) {
                      int newsize;
                      printf("\tEnter new size: ");
                      scanf("%d", &newsize);
                      fflush(stdin);

                      if (newsize > 0) {
                          size = size + newsize;
                          p = realloc(p, sizeof(Player) * size);
                           if (p == NULL) {
                              printf("\tMemory allocation failed!\n");
                              return;
                            }
                        } else {
                            printf("\tInvalid size!\n");
                        } 
                    } else if (choice == 2) {
                          break;
                        }

				}
				break;
			}
			case 2:{
				removeplayer(p,&pcount);
				break;
			}
			case 3:{
				search(p,&pcount);
				break;
			}
			case 4:{
				update(p,&pcount);
				break;
			}
			case 5:{
				sort(p,&pcount);
				break;
			}
			case 6:{
				display(p,&pcount);
				break;
			}
			case 7:{
				top3(p,&pcount);
				break;
			}
			case 8:{
				printf("\tProgram exited");
				return 0;
			}
			default:{
				printf("\tInvalid Choice! Please try again\n");
				break;
			}
		}
	}
}

void add(Player *p,int *pcount)
{
	printf("\tEnter Jersey Number:");
	scanf("%d",&p[*pcount].jnumber);
	fflush(stdin);
	
	printf("\tEnter Name:");
	gets(p[*pcount].name);
	fflush(stdin);
	
	printf("\tEnter Runs Made:");
	scanf("%d",&p[*pcount].runs);
	fflush(stdin);
	
	printf("\tEnter Wickets Taken:");
	scanf("%d",&p[*pcount].wickets);
	fflush(stdin);
	
	printf("\tEnter Matches Played:");
	scanf("%d",&p[*pcount].matches);
	fflush(stdin);
	printf("\n");
	printf("\t---Player %d added successfully---\n",(*pcount)+1);
	(*pcount)++;
}

void removeplayer(Player *p, int *pcount)
{
	
	int pjersey;
	while(1){

        printf("\tEnter jersey number to remove: ");
		if((scanf("%d",&pjersey)) == 1 && pjersey > 0){
			break;}
		else{
			printf("\tInvalid input! Please enter a number\n");
			fflush(stdin);
	    }
    }

    int i, flag = 0;
    for (i=0; i<*pcount; i++)
    {
        if (pjersey == p[i].jnumber)
        {
            flag = 1;
            int j;
            for (j=i; j<*pcount-1; j++)
            {
                p[j] = p[j+1]; 
            }
            (*pcount)--; 
            printf("\t----Player removed successfully!----\n");
            return;
        }
    }
    if (flag == 0)
    {
        printf("\tPlayer of this jersey number dont exist\n");
    }
}

void search(Player *p, int *pcount)
{
	printf("\tSearch By?\n");
	printf("\t\t1.Jersey Number\n");
	printf("\t\t2.Player Name\n");
	int choice;
	printf("\n");
	while(1){  
	printf("\tEnter your choice:");
		if((scanf("%d",&choice))== 1 && choice>0){
			break;}
		else{
			printf("\tInvalid input! Please enter number 1 or 2\n");
			fflush(stdin);
	    }
    }
	
	switch(choice){
		case 1:{
			int jsearch;
			while(1){
				printf("\tEnter Jersey number to search:");
//			    scanf("%d",&jsearch);
			    if((scanf("%d",&jsearch))==1 && jsearch>0){	
			    	break;
				}
				else{
					printf("\tInvalid Input! Please enter a number");
					fflush(stdin);
				}
			}
			
			printf("\n");
			int i, flag = 0;
			for(i=0; i<*pcount; i++){
				if(jsearch == p[i].jnumber){
					flag = 1;
					break;
				}
			}if(flag == 1){
	printf("\t==============================\n");
	printf("\t        PLAYER FOUND      \n");
	printf("\t==============================\n");
		
			printf("\tJersey Number: %d\n",p[i].jnumber);
			printf("\tName:%s\n",p[i].name);
			printf("\tRuns:%d\n",p[i].runs);
			printf("\tWickets:%d\n",p[i].wickets);
			printf("\tMatches:%d\n",p[i].matches);
	}else{
		printf("\tPlayer of this jersey number dont exist\n");
	}
			break;
		}
		case 2:{
		  char psearch[20];
    	  printf("\tEnter name of player to search:");
	      scanf("%s",&psearch);
	      fflush(stdin);
	      printf("\n");
         	int i, flag = 0;
         	for(i=0; i<*pcount; i++){
	     	if(strcasecmp(psearch,p[i].name)==0){
		   	flag = 1;
			break;	
		}
	}
	if(flag == 1){
		printf("\t\n==============================\n");
	printf("\t        PLAYER FOUND      \n");
	printf("\t==============================\n");
	
			printf("\t\tJersey Number: %d\n",p[i].jnumber);
			printf("\t\tName:%s\n",p[i].name);
			printf("\t\tRuns:%d\n",p[i].runs);
			printf("\t\tWickets:%d\n",p[i].wickets);
			printf("\t\tMatches:%d\n",p[i].matches);
			printf("\t------------------------------\n");
			printf("\n");
	}else{
		printf("\tInvalid Name! Player not found\n");
	}
			break;
		}
	}	
}

void update(Player *p, int *pcount)
{
	
	int pjersey;
	while(1){

        printf("\tEnter jersey number to update: ");
	    

		if(scanf("%d",&pjersey) == 1 && pjersey > 0){
			break;}
		else{
			printf("\tInvalid input! Please enter a number\n");
			fflush(stdin);
	    }
    }
	printf("\n");
	int i;
	for(i=0; i<*pcount; i++){
		if(pjersey==p[i].jnumber){
			printf("\tWhat you want to update?\n");
			printf("\t\t1.Runs\n");
			printf("\t\t2.Wickets\n");
			printf("\t\t3.Matches Played\n");
			while(1){
					int choice;
			printf("\tEnter your choice:");
			scanf("%d",&choice);
			fflush(stdin);
			
			switch(choice){
				case 1:{
					printf("\tEnter updated runs:");
					scanf("%d",&p[i].runs);
					fflush(stdin);
					break;
				}
				case 2:{
					printf("\tEnter updated wickets:");
					scanf("%d",&p[i].wickets);
					fflush(stdin);
					break;
				}
				case 3:{
					printf("\tEnter updated matches:");
					scanf("%d",&p[i].matches);
					fflush(stdin);
					break;
				}
				default:{
					printf("\tInvalid choice:! Please enter number 1 or 2 or 3\n");
					continue;
				}
			}
			break;
			}
			
			printf("\t----Details updated successfully!----\n");
			return;
		}
	}
	printf("\tPlayer of this jersey number dont exist");	
}

void sort(Player *p, int *pcount)
{
	while(1){
		Player arr[*pcount];
	int i;
	for(i=0;i<*pcount;i++){
		arr[i] = p[i];
	}
	
	printf("\tSort based on?\n");
	printf("\t\t1.Maximum to minimum runs\n");
	printf("\t\t2.Maximum to minimum wickets\n");
	int choice;
	printf("\tEnter your choice:");
	scanf("%d",&choice);
	fflush(stdin);
	printf("\n");
	
	if(choice == 1){
		int i;
		Player temp;
	for(i=0; i<*pcount-1; i++){
		int j;
		for(j=0; j<*pcount-1-i; j++){
			if(arr[j].runs<arr[j+1].runs){
				temp = arr[j];
			    arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	printf("\t\n=========================================\n");
	printf("\t        LEADING PERFORMERS ACCORDING TO RUNS      \n");
	printf("\t===========================================\n");
	
	printf("\n");
	for(i=0; i<*pcount; i++){
		printf("\tJersey Number:%d\n",arr[i].jnumber);
		printf("\tName:%s\n",arr[i].name);
		printf("\tRuns:%d\n",arr[i].runs);
		printf("\tWickets:%d\n",arr[i].wickets);
		printf("\tMatches:%d\n",arr[i].matches);
		printf("\t------------------------------\n");
		printf("\n");
		
	}
	break;
	}else if(choice == 2){
		int i;
		Player temp;
	for(i=0; i<*pcount-1; i++){
		int j;
		for(j=0; j<*pcount-1-i; j++){
			if(arr[j].wickets<arr[j+1].wickets){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	printf("\t\n=========================================\n");
	printf("\t        LEADING PERFORMERS ACCORDING TO WICKETS      \n");
	printf("\t===========================================\n");
	printf("\n");
	for(i=0; i<*pcount; i++){
		printf("\tJersey Number:%d\n",arr[i].jnumber);
		printf("\tName:%s\n",arr[i].name);
		printf("\tRuns:%d\n",arr[i].runs);
		printf("\tWickets:%d\n",arr[i].wickets);
		printf("\tMatches:%d\n",arr[i].matches);
		printf("\t------------------------------\n");
		printf("\n");
	}
	break;
	}
	else{
		printf("\tInvalid input! Please enter number 1 or 2\n");
		fflush(stdin);
	}
	}
	
}

void display(Player *p, int *pcount)
{
	printf("\t\n==============================\n");
	printf("\t        PLAYER DETAILS       \n");
	printf("\t==============================\n");
	int i;
	for(i = 0; i < *pcount; i++){
		printf("\tJersey Number: %d\n", p[i].jnumber);
		printf("\tName: %s\n", p[i].name);
		printf("\tRuns: %d\n", p[i].runs);
		printf("\tWickets: %d\n", p[i].wickets);
		printf("\tMatches: %d\n", p[i].matches);
		printf("\t------------------------------\n");
	}
}

void top3(Player *p, int *pcount)
{
	Player arr[*pcount];
	int i;
	for(i=0;i<*pcount;i++){
		arr[i] = p[i];
	}
	
	printf("\tDisplay based on?\n");
	printf("\t1.Runs\n");
	printf("\t2.Wickets\n");
	
	int choice;
	printf("\tEnter your choice:");
	scanf("%d",&choice);
	fflush(stdin);
	
	if(choice == 1){
		int i;
		Player temp;
	for(i=0; i<*pcount; i++){
		int j;
		for(j=0; j<*pcount-1-i; j++){
			if(arr[j].runs<arr[j+1].runs){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	printf("\t==========================================\n");
	printf("\t        TOP 3 PERFORMERS ACCORDING TO RUNS        \n");
	printf("\t============================================\n");
	printf("\n");
	for(i=0; i<3; i++){
		printf("\t\tJersey Number:%d\n",arr[i].jnumber);
		printf("\t\tName:%s\n",arr[i].name);
		printf("\t\tRuns:%d\n",arr[i].runs);
		printf("\t\tWickets:%d\n",arr[i].wickets);
		printf("\t\tMatches:%d\n",arr[i].matches);
		printf("\t------------------------------\n");
	}
	}else if(choice == 2){
		int i;
		Player temp;
	for(i=0; i<*pcount; i++){
		int j;
		for(j=0; j<*pcount-1-i; j++){
			if(arr[j].wickets<arr[j+1].wickets){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	printf("\t\n==========================================\n");
	printf("\t        TOP 3 PERFORMERS ACCORDING TO WICKETS        \n");
	printf("\n============================================\n");
	printf("\n");
	for(i=0; i<3; i++){
		printf("\t\tJersey Number:%d\n",arr[i].jnumber);
		printf("\t\tName:%s\n",arr[i].name);
		printf("\t\tRuns:%d\n",arr[i].runs);
		printf("\t\tWickets:%d\n",arr[i].wickets);
		printf("\t\tMatches:%d\n",arr[i].matches);
		printf("\t------------------------------\n");
	}
	}
	else{
		printf("\tInvalid input! Please enter number 1 or 2\n");
		fflush(stdin);
	}
}
