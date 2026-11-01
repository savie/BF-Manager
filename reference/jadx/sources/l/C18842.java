package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18842 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61041;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3146(C2398 c2398) {
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C18842(ArrayList arrayList) {
        this.f61041 = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C18136) arrayList.get(0)).f57996;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((C18136) arrayList.get(i)).f57997 < j) {
                    z = true;
                    break;
                }
                j = ((C18136) arrayList.get(i)).f57996;
            }
        }
        C2023.m6507(!z);
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f61041;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18842.class != obj.getClass()) {
            return false;
        }
        return this.f61041.equals(((C18842) obj).f61041);
    }

    public final int hashCode() {
        return this.f61041.hashCode();
    }
}
