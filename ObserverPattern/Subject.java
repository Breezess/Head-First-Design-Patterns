package ObserverPattern;

public interface Subject {
	/*ע��۲���*/
	public void registerObserver(Observer o);
	/*ɾ���۲���*/
	public void removeObserver(Observer o);
	/*������״̬�ı�ʱ��֪ͨ���еĹ۲���*/
	public void notifyObservers();
}
