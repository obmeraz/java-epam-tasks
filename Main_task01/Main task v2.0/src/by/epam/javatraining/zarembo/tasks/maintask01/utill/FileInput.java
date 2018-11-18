package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class FileInput extends Input {
    @Override
    public void create(UpgradeVector vector) {
        vector.setVector(FileVectorCreator.create(FileValidator.valid(FileParser.parse())));
    }
}
