/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.pdsdemo.model;

/**
 *
 * @author sala305
 */
public class Note {

    private long IdNote;
    private long IdStudent;
    private long IdTopic;
    private long Value;
    private long Percent;

    public Note() {
    }

    public Note(long IdNote) {
        this.IdNote = IdNote;
    }

    public Note(long IdNote, long IdStudent, long IdTopic, long Value, long Percent) {
        this.IdNote = IdNote;
        this.IdStudent = IdStudent;
        this.IdTopic = IdTopic;
        this.Value = Value;
        this.Percent = Percent;
    }

    public long getIdNote() {
        return IdNote;
    }

    public void setIdNote(long IdNote) {
        this.IdNote = IdNote;
    }

    public long getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(long IdStudent) {
        this.IdStudent = IdStudent;
    }

    public long getIdTopic() {
        return IdTopic;
    }

    public void setIdTopic(long IdTopic) {
        this.IdTopic = IdTopic;
    }

    public long getValue() {
        return Value;
    }

    public void setValue(long Value) {
        this.Value = Value;
    }

    public long getPercent() {
        return Percent;
    }

    public void setPercent(long Percent) {
        this.Percent = Percent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (this.IdNote ^ (this.IdNote >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Note other = (Note) obj;
        if (this.IdNote != other.IdNote) {
            return false;
        }
        return true;
    }
    
    
}
