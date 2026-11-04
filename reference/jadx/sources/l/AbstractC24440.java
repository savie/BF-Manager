package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24440 implements InterfaceC25186, Serializable {
    public static final long serialVersionUID = 7535258609338176893L;

    @Override // l.InterfaceC25186
    public String getName() {
        return null;
    }

    public Object readResolve() {
        return C16980.m40038(getName());
    }
}
