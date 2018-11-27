package main.java.memoranda;

import main.java.memoranda.interfaces.IProject;
import nu.xom.Document;
import nu.xom.Element;

public class Setup {
    private IProject _project = null;
    private Document _doc = null;
    private Element _root = null;
    public IProject get_project() {
        return _project;
    }
    public void set_project(IProject _project) {
        this._project = _project;
    }
    public Document get_doc() {
        return _doc;
    }
    public void set_doc(Document _doc) {
        this._doc = _doc;
    }
    public Element get_root() {
        return _root;
    }
    public void set_root(Element _root) {
        this._root = _root;
    }
}
