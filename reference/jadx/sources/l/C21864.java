package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J540 */
/* JADX INFO: loaded from: classes.dex */
public final class C21864 implements Serializable {
    public static final long serialVersionUID = -8017692739988399978L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15675 f69698 = new C15675();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15150 f69699;

    public C21864(C15150 c15150) {
        this.f69699 = c15150;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49557() {
        C15675 c15675 = this.f69698;
        if (c15675.isEmpty()) {
            return;
        }
        new C8612(this.f69699);
        C4937.forEach(c15675, new C4710());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49558() {
        C15675 c15675 = this.f69698;
        if (c15675.isEmpty()) {
            return;
        }
        new C8612(this.f69699);
        C4937.forEach(c15675, new C13832());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
