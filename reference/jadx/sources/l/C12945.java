package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۬ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12945 implements InterfaceC23715 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f43034;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f43035 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f43033 = new ConcurrentMapC13783();

    public C12945(String str) {
        this.f43034 = str;
    }

    @Override // l.InterfaceC23715
    /* JADX INFO: renamed from: ܰ */
    public final void mo26980(AbstractC17364 abstractC17364) {
        synchronized (this) {
            AbstractC11015 abstractC11015Mo40399 = abstractC17364.mo40399();
            if (abstractC11015Mo40399 != null && abstractC11015Mo40399.mo1673()) {
                this.f43035.put(abstractC17364.getName(), abstractC11015Mo40399);
            } else {
                this.f43035.put(abstractC17364.getName(), ((C22823) abstractC17364.mo40398()).m50535(abstractC17364.mo40397(), abstractC17364.getName(), abstractC11015Mo40399 != null ? abstractC11015Mo40399.mo1671() : ""));
            }
        }
    }

    @Override // l.InterfaceC23715
    /* JADX INFO: renamed from: ۙ */
    public final void mo26978(AbstractC17364 abstractC17364) {
        synchronized (this) {
            this.f43035.remove(abstractC17364.getName());
            this.f43033.remove(abstractC17364.getName());
        }
    }

    @Override // l.InterfaceC23715
    /* JADX INFO: renamed from: ۨ */
    public final void mo26979(AbstractC17364 abstractC17364) {
        synchronized (this) {
            this.f43035.put(abstractC17364.getName(), abstractC17364.mo40399());
            this.f43033.remove(abstractC17364.getName());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n\tType: ");
        sb.append(this.f43034);
        ConcurrentMapC13783 concurrentMapC13783 = this.f43035;
        if (concurrentMapC13783.isEmpty()) {
            sb.append("\n\tNo services collected.");
        } else {
            sb.append("\n\tServices");
            for (Map.Entry entry : concurrentMapC13783.entrySet()) {
                sb.append("\n\t\tService: ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        ConcurrentMapC13783 concurrentMapC13784 = this.f43033;
        if (concurrentMapC13784.isEmpty()) {
            sb.append("\n\tNo event queued.");
        } else {
            sb.append("\n\tEvents");
            for (Map.Entry entry2 : concurrentMapC13784.entrySet()) {
                sb.append("\n\t\tEvent: ");
                sb.append((String) entry2.getKey());
                sb.append(": ");
                sb.append(entry2.getValue());
            }
        }
        return sb.toString();
    }
}
