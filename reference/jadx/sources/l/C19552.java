package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J540 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19552 implements Serializable {
    public static final long serialVersionUID = -8017692739988399978L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16212 f62831 = new C16212();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20963 f62832;

    public C19552(C20963 c20963) {
        this.f62832 = c20963;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44642() {
        C16212 c16212 = this.f62831;
        if (c16212.isEmpty()) {
            return;
        }
        C0356.forEach(c16212, new C8263(0, new C18140(this.f62832)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44643() {
        C16212 c16212 = this.f62831;
        if (c16212.isEmpty()) {
            return;
        }
        C0356.forEach(c16212, new C5735(1, new C18140(this.f62832)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
