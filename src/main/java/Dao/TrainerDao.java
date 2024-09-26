package Dao;

import javax.persistence.EntityManager;

import Model.Trainer;
import Service.TrainerService;
import Utility.DBUtil;

public class TrainerDao implements TrainerService {

		public Trainer addTrainer(Trainer trainer) {

			EntityManager em = DBUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(trainer);
			em.getTransaction().commit();
			
			
			return trainer;
		}

		@Override
		public Trainer getById(int trainerId) {
			EntityManager em = DBUtil.getEntityManager();
			em.getTransaction().begin();
			//Object<Entity> find(EntityClass, PrimaryKeyValue)
			
			Trainer t = em.find(Trainer.class, trainerId);
			return t;
		}

	@Override
	public void removeTrainer(int trainerId) {
		EntityManager em=DBUtil.getEntityManager();
		em.getTransaction().begin();
		Trainer tObj=em.find(Trainer.class, trainerId);
		//void remove(object entity):EntityManager
		em.remove(tObj);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateTrainer(int trainerId, String newSkillSet, long newPhone) {
		
		EntityManager em=DBUtil.getEntityManager();
		em.getTransaction().begin();
		Trainer t=em.find(Trainer.class,trainerId);
		t.setSkillSet(newSkillSet);
		t.setPhone(newPhone);
		em.persist(t);
		em.getTransaction().commit();
		System.out.println("Enter the data updated successfully");
		
	}

	 

}
