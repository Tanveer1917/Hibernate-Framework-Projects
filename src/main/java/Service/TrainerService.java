package Service;

import Model.Trainer;

public interface TrainerService {

	// add trainer object to DB
    public Trainer addTrainer(Trainer trainer);
	
    // IT will fetch trainer object from DB
    public Trainer getById(int trainerId);
    
	// It will remove trainer object from DB
    public void removeTrainer(int trainerId);
    
	// It will update skill set,phone number of a trainer
    public void updateTrainer(int trainerId, String newSkillSet, long newPhone);

}
