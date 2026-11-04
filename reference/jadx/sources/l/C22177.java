package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes.dex */
public final class C22177 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71451;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12246(C18632 c18632) {
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C22177(ArrayList arrayList) {
        this.f71451 = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C5023) arrayList.get(0)).f17414;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((C5023) arrayList.get(i)).f17415 < j) {
                    z = true;
                    break;
                }
                j = ((C5023) arrayList.get(i)).f17414;
            }
        }
        C20782.m47565(!z);
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f71451;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22177.class != obj.getClass()) {
            return false;
        }
        return this.f71451.equals(((C22177) obj).f71451);
    }

    public final int hashCode() {
        return this.f71451.hashCode();
    }
}
