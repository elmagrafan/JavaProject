package storage;

/**
 * Created by Ovidiu on 10/21/2017.
 */
public class AtmDaoFactory {

    public static AtmDao getStorageModel(StorageType storageType)
    {
        switch (storageType)
        {
            case IN_MEMORY_STORAGE:
                return AtmDaoInMemoryImpl.getInstanceOfThisClass();

            case FILE_BASED_STORAGE:
                return new AtmDaoFileBasedImpl();

            // TODO: for DB case
        }

        return null;
    }

}
