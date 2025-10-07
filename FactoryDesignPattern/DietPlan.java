public abstract class DietPlan {
    public abstract Carbs createCarbs();
    public abstract Fats createFats();
    public abstract Protein createProtein();
}

class NoRestrictionsDietPlan extends DietPlan {
    @Override
    public Carbs createCarbs() {
        return new NoRestrictionsCarbs();
    }

    @Override
    public Fats createFats() {
        return new NoRestrictionsFats();
    }

    @Override
    public Protein createProtein() {
        return new NoRestrictionsProtein();
    }
}

class PaleoDietPlan extends DietPlan {
    @Override
    public Carbs createCarbs() {
        return new PaleoCarbs();
    }

    @Override
    public Fats createFats() {
        return new PaleoFats();
    }

    @Override
    public Protein createProtein() {
        return new PaleoProtein();
    }
}

class VeganDietPlan extends DietPlan {
    @Override
    public Carbs createCarbs() {
        return new VeganCarbs();
    }

    @Override
    public Fats createFats() {
        return new VeganFats();
    }

    @Override
    public Protein createProtein() {
        return new VeganProtein();
    }
}

class NutAllergyDietPlan extends DietPlan {
    @Override
    public Carbs createCarbs() {
        return new NutAllergyCarbs();
    }

    @Override
    public Fats createFats() {
        return new NutAllergyFats();
    }

    @Override
    public Protein createProtein() {
        return new NutAllergyProtein();
    }
}