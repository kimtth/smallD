/*
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.ui.wizard

import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.resource.FileExtensionProvider

class MydslNewProjectWizardInitialContents {
	@Inject
	FileExtensionProvider fileExtensionProvider

	def generateInitialContents(IFileSystemAccess2 fsa) {
		fsa.generateFile(
			"src/prototype." + fileExtensionProvider.primaryFileExtension,
			makeDSLContents()
		)
	}

	def makeDSLContents() {
		var src = new StringBuffer();

		src.append("var g : num\n");
		src.append("def function(num a, num b){\n\n");
		src.append("\tval local : num\n"); 
		src.append("\tval localStr : string\n\n");

		src.append("\tif(a == b){\n\n");
		src.append("\t}else{\n\n");
		src.append("\t}\n\n");
		
		src.append("\tlocal = 10\n");
		src.append("\tlocalStr = \"ssss\"\n\n");
		src.append("\twhile(a < 10){\n\n");
		src.append("\t\tif(a != b){\n");
		src.append("\t\t\tbreak\n");
		src.append("\t\t}\n");
		src.append("\t}\n");
		
		src.append("\treturn a\n");
		src.append("}");
		src.append("\n\n");
		
		src.append("launch_main(){\n");
		src.append("\tval a : num\n");
		src.append("\tval b : num\n");
		src.append("\tval c : string\n\n");
		
		src.append("\ta = function(a, b)\n");
		src.append("}");
		src.append("\n\n");

		return src.toString();
	}

}
