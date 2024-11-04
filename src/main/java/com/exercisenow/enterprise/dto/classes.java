import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// User class
class User {
    private int userID;
    private String username;
    private String email;
    private String password;
    private int age;
    private double weight;
    private double height;
    private List<WeeklyGoal> weeklyGoals;
    private WorkoutRegimen currentRegimen;
    private List<Reward> rewards;

    public User(int userID, String username, String email, String password, int age, double weight, double height) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.weeklyGoals = new ArrayList<>();
        this.rewards = new ArrayList<>();
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<WeeklyGoal> getWeeklyGoals() {
        return weeklyGoals;
    }

    public WorkoutRegimen getCurrentRegimen() {
        return currentRegimen;
    }

    public void setCurrentRegimen(WorkoutRegimen currentRegimen) {
        this.currentRegimen = currentRegimen;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void login() {
        // Implementation for user login
    }

    public void viewProgress() {
        // Implementation for viewing progress
    }

    public void updateProfile() {
        // Implementation for updating user profile
    }

    public void viewRewards() {
        // Implementation for viewing rewards
    }

    public void setWeeklyGoal(WeeklyGoal goal) {
        this.weeklyGoals.add(goal);
    }

    public void trackWorkout(Workout workout) {
        if (currentRegimen != null) {
            currentRegimen.addExercise(workout);
        }
    }
}

// Workout class
class Workout {
    private int workoutID;
    private int userID;
    private String type;
    private double duration; // in minutes
    private String intensity;
    private double caloriesBurned;
    private Date date;

    public Workout(int workoutID, int userID, String type, double duration, String intensity, double caloriesBurned,
            Date date) {
        this.workoutID = workoutID;
        this.userID = userID;
        this.type = type;
        this.duration = duration;
        this.intensity = intensity;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
    }

    // Getters and Setters
    public int getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void logWorkout() {
        // Implementation for logging workout
    }

    public void calculateCalories() {
        // Implementation for calculating calories burned
    }
}

// WeeklyGoal class
class WeeklyGoal {
    private int goalID;
    private int userID;
    private double targetCalories;
    private int targetWorkouts;
    private double targetDuration;
    private double currentCalories;
    private int currentWorkouts;
    private double currentDuration;
    private double progressPercentage;

    public WeeklyGoal(int goalID, int userID, double targetCalories, int targetWorkouts, double targetDuration) {
        this.goalID = goalID;
        this.userID = userID;
        this.targetCalories = targetCalories;
        this.targetWorkouts = targetWorkouts;
        this.targetDuration = targetDuration;
        this.currentCalories = 0;
        this.currentWorkouts = 0;
        this.currentDuration = 0;
        this.progressPercentage = 0;
    }

    public void updateProgress(double calories) {
        currentCalories += calories;
        calculateProgressPercentage();
    }

    private void calculateProgressPercentage() {
        progressPercentage = (currentCalories / targetCalories) * 100;
    }


    // Getters and Setters
    public int getGoalID() {
        return goalID;
    }

    public void setGoalID(int goalID) {
        this.goalID = goalID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getTargetCalories() {
        return targetCalories;
    }

    public void setTargetCalories(double targetCalories) {
        this.targetCalories = targetCalories;
    }

    public int getTargetWorkouts() {
        return targetWorkouts;
    }

    public void setTargetWorkouts(int targetWorkouts) {
        this.targetWorkouts = targetWorkouts;
    }

    public double getTargetDuration() {
        return targetDuration;
    }

    public void setTargetDuration(double targetDuration) {
        this.targetDuration = targetDuration;
    }

    public double getCurrentCalories() {
        return currentCalories;
    }

    public int getCurrentWorkouts() {
        return currentWorkouts;
    }

    public double getCurrentDuration() {
        return currentDuration;
    }

    public double getProgressPercentage() {
        return progressPercentage;
    }

    public void updateProgress(double calories, int workouts, double duration) {
        currentCalories += calories;
        currentWorkouts += workouts;
        currentDuration += duration;
        checkGoalCompletion();
    }

    public void checkGoalCompletion() {
        // Implementation for checking goal completion
        progressPercentage = (currentCalories / targetCalories) * 100; // Example calculation
    }
}

// WorkoutRegimen class
class WorkoutRegimen {
    private int regimenID;
    private int userID;
    private List<Workout> exercises;
    private String[] schedule;
    private String notes;

    public WorkoutRegimen(int regimenID, int userID, String[] schedule, String notes) {
        this.regimenID = regimenID;
        this.userID = userID;
        this.exercises = new ArrayList<>();
        this.schedule = schedule;
        this.notes = notes;
    }

    // Getters and Setters
    public int getRegimenID() {
        return regimenID;
    }

    public void setRegimenID(int regimenID) {
        this.regimenID = regimenID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<Workout> getExercises() {
        return exercises;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void addExercise(Workout workout) {
        exercises.add(workout);
    }

    public void removeExercise(Workout workout) {
        exercises.remove(workout);
    }

    public void viewRegimen() {
        // Implementation for viewing the workout regimen
    }
}

// Exercise class
class Exercise {
    private int exerciseID;
    private String name;
    private String type; // e.g., cardio, strength
    private double duration; // in minutes
    private double goalCaloriesBurned;

    public Exercise(int exerciseID, String name, String type, double duration, double goalCaloriesBurned) {
        this.exerciseID = exerciseID;
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.goalCaloriesBurned = goalCaloriesBurned;
    }

    // Getters and Setters
    public int getExerciseID() {
        return exerciseID;
    }

    public void setExerciseID(int exerciseID) {
        this.exerciseID = exerciseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getGoalCaloriesBurned() {
        return goalCaloriesBurned;
    }

    public void setGoalCaloriesBurned(double goalCaloriesBurned) {
        this.goalCaloriesBurned = goalCaloriesBurned;
    }

    public void addToRegimen(WorkoutRegimen regimen) {
        // Implementation to add exercise to regimen
    }

    public void removeFromRegimen(WorkoutRegimen regimen) {
        // Implementation to remove exercise from regimen
    }
}

// Reward class
class Reward {
    private int rewardID;
    private String description;
    p



        this.description = description;
        this.goalToAchieve = goalToAchieve;
    }

    public double calculateProgressPercentage(double currentProgress, double goal) {
        return (currentProgress / goal) * 100;
    }
}


    // Getters and Setters
    public int getRewardID() {
        return rewardID;
    }

    public void setRewardID(int rewardID) {
        this.rewardID = rewardID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoalToAchieve() {
        return goalToAchieve;
    }

    public void setGoalToAchieve(String goalToAchieve) {
        this.goalToAchieve = goalToAchieve;
    }

    public double getProgressPercentage() {
        return progressPercentage;
    }

    public void checkRewardEligibility() {
        // Implementation to check eligibility for the reward
    }
}

// ProgressChart class
class ProgressChart {
    private int chartID;
    private int userID;
    private List<Workout> weeklyData;
    private List<WeeklyGoal> goalData;

    public ProgressChart(int chartID, int userID) {
        this.chartID = chartID;
        this.userID = userID;
        this.weeklyData = new ArrayList<>();
        this.goalData = new ArrayList<>();
    }

    // Getters and Setters
    public int getChartID() {
        return chartID;
    }

    public void setChartID(int chartID) {
        this.chartID = chartID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<Workout> getWeeklyData() {
        return weeklyData;
    }

    public List<WeeklyGoal> getGoalData() {
        return goalData;
    }

    public void generateChart() {
        // Implementation to generate a progress chart
    }

    public void compareToGoals() {
        // Implementation to compare progress to goals
    }
}
