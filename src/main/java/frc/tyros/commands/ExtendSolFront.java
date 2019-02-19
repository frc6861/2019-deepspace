package frc.tyros.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.tyros.OI;
import frc.tyros.subsystems.Ingestor;

/**
 *
 */
public class ExtendSolFront extends CommandGroup {
    private Ingestor ingestor;
    public ExtendSolFront(OI m_oi) {
        ingestor = m_oi.getIngestor();
        ingestor.backExtend();
    }
}