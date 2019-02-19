package frc.tyros.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.tyros.OI;
import frc.tyros.subsystems.Ingestor;

/**
 *
 */
public class RetractSolBack extends CommandGroup {
    private Ingestor ingestor;
    public RetractSolBack(OI m_oi) {
        ingestor = m_oi.getIngestor();
        ingestor.backRetract();
    }
}