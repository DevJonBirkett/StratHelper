package uk.co.arccon.strathelper;

enum Factions{
    ThousandSon,AdeptusCustodes
}

enum Phases{
    BeforeBattle, DuringDeployment,
    AtTheStartOfBattleRound,
    AnyPhase, CommandPhase,
    MovementPhase, EnemyMovementPhase,
    PsychicPhase, EnemyPsychicPhase,
    ShootingPhase, EnemyShootingPhase, BeingTargeted,
    ChargePhase, EnemyChargePhase,
    FightPhase, EnemyRightPhase,
    TakingCasualties, EnemyTakingCasualties,
    Morale, EnemyMorale
}

enum StratagemCategory{
    WarGear,Requisition,StrategicPloy,BattleTactic,EpicDeed
}

public class stratagems {
    Factions faction;
    String name;
    String cPCost;
    String description;
    Phases phases[];
    StratagemCategory stratCat;
    String summary;

    public stratagems(Factions f1, String f2, String f3, String f4, Phases[] f5, StratagemCategory f6, String f7)
    {
        this.faction = f1;
        this.name = f2;
        this.cPCost = f3;
        this.description = f4;
        this.phases = f5;
        this.stratCat = f6;
        this.summary = f7;
    }

}
