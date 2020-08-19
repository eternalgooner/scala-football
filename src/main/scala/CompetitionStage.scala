sealed trait CompetitionStage {

  case object Last16 extends CompetitionStage
  case object QuaterFinal extends CompetitionStage
  case object SemiFinal extends CompetitionStage
  case object Final extends CompetitionStage
}
