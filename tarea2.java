

public class tarea2{
	
	// maneja pivote
	public int pivote(int[] des, int inicio, int fin){
		int pivot = inicio, i=0, j=0,aux=0;
		i = inicio+1;
		j=fin;
		
		while(true){
			
			while(des[i]<des[pivot] && i<fin){i=i+1;}
			
			while(des[j]>des[pivot]){j=j-1;}
			
			if(i<j){
				aux=des[i];
				des[i]=des[j];
				des[j]=aux;
			;}
			else
			{
			aux=des[pivot];
			des[pivot]=des[j];
			des[j]=aux;
			return j;
		}
		}
	}
	
	//probando multiples threads
	public static void main(String[] args){
		int [] desorden = {4,3,7,1,5,2,6};
		int pivot = 0;
		pivot = pivote(desorden,1,7);
		
		
		System.out.print(pivot);
		
		
	}
}