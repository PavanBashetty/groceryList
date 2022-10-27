package groceryList;

import java.util.ArrayList;

public class GroceryList {

	private static ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public ArrayList<String> getGroceryList(){
		return groceryList;
	}
	
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in the list");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1)+". "+groceryList.get(i));
		}
	}
	
	private int findItem(String searchItem) {
		return groceryList.indexOf(searchItem);
	}
	
	public void modifyGroceryList(String currItem, String newItem) {
		int position = findItem(currItem);
		if(position>=0) {
			modifyGroceryList(position, newItem);
		}
	}
	
	private void modifyGroceryList(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position + 1) + " has been updated");
	}
	
	public void removeGroceryItem(String currItem) {
		int position = findItem(currItem);
		if(position>=0) {
			removeGroceryItem(position);	
		}
	}
	
	private void removeGroceryItem(int position) {
		groceryList.remove(position);
		System.out.println("Grocery item " + (position+1) + " has been removed");
	}
	
	public boolean onFile(String item) {
		int position = findItem(item);
		if(position>=0) {
			return true;
		}
		return false;
	}
}










