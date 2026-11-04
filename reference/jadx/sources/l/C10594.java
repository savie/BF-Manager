package l;

import java.util.EventListener;

/* JADX INFO: renamed from: l.ۤۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes3.dex */
public class C10594 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EventListener f33627;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f33628;

    public C10594(InterfaceC6492 interfaceC6492, boolean z) {
        this.f33627 = interfaceC6492;
        this.f33628 = z;
    }

    public final int hashCode() {
        return this.f33627.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EventListener m27043() {
        return this.f33627;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m27044() {
        return this.f33628;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10594) {
            return this.f33627.equals(((C10594) obj).f33627);
        }
        return false;
    }
}
