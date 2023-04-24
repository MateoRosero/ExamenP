import java.util.*;

public class SocialNetwork {

    private Queue<Persona> waitingQueue;
    private PriorityQueue<Persona> priorityQueue;
    private Stack<Persona> removedStack;

    public SocialNetwork() {
        waitingQueue = new LinkedList<>();
        priorityQueue = new PriorityQueue<>(new PersonaComparator());
        removedStack = new Stack<>();
    }

    public void addPerson(Persona person) {
        waitingQueue.offer(new Persona());
        priorityQueue.offer(new Persona());
    }

    public void activatePerson() {
        if (!waitingQueue.isEmpty()) {
            Persona person = waitingQueue.poll();
            System.out.println("Activating " + person.getNombreCompleto());
            person.setActive(true);
        }
    }

    public void deactivatePerson(Persona person) {
        System.out.println("Deactivating " + person.getNombreCompleto());
        person.setActive(false);
        removedStack.push(person);
    }

    public void reactivatePerson() {
        if (!removedStack.isEmpty()) {
            Persona person = removedStack.pop();
            System.out.println("Reactivating " + Persona.getNombreCompleto());
            person.setActive(true);
            waitingQueue.offer(person);
            priorityQueue.offer(person);
        }
    }

    private class PersonaComparator implements Comparator<Persona> {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p2.getActivityLevel(), p1.getActivityLevel());
        }
    }
}
