package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23950 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2076 f77673;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14778 f77674;

    public RunnableC23950(C14778 c14778, C2076 c2076) {
        this.f77674 = c14778;
        this.f77673 = c2076;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14778 c14778 = this.f77674;
        List list = c14778.f48321;
        C2076 c2076 = this.f77673;
        list.add(c2076);
        if (!C2761.m8429(C1791.m5862())) {
            C23099.m51107("AttaReporter", "attaReport net disconnect, " + c2076);
        } else {
            try {
                C14778.m35415(c14778);
            } catch (Exception e) {
                C23099.m51111("AttaReporter", "Exception", e);
            }
        }
    }
}
