package no.priv.bang.modeler.core.gef.editor;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

/**
 * Used as an input to a GEF Editor that doesn't open a file.
 * The idea is to later fill this class with Neo4J database connection info.
 * 
 * @author Steinar Bang <sb@dod.no>
 *
 */
@SuppressWarnings("deprecation")
public class StringEditorInput implements IStorageEditorInput {
	
	private String inputString;

	public StringEditorInput(String inputString) {
		this.inputString = inputString;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "input name";
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return new IStorage() {

			@SuppressWarnings("rawtypes")
			@Override
			public Object getAdapter(Class adapter) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public InputStream getContents() throws CoreException {
				return new StringBufferInputStream(inputString);
			}

			@Override
			public IPath getFullPath() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getName() {
				return StringEditorInput.this.getName();
			}

			@Override
			public boolean isReadOnly() {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
	}

}
