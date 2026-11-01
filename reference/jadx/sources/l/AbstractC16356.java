package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CA2B */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f52660;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52661;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19116(C0938 c0938);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo37323(C5982 c5982);

    public AbstractC16356(int i, String str) {
        this.f52661 = i;
        this.f52660 = str;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo37324(C5982 c5982, C4466 c4466) throws IOException {
        AbstractC14676 abstractC14676 = AbstractC14676.f47970;
        C0938 c0938 = new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, this.f52661).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) c4466, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C19884.f63754);
        arrayList.add(c0938);
        C0938 c0939 = new C0938(AbstractC14676.m35208(EnumC1974.APPLICATION, 0), (AbstractC9032) new C4466(arrayList), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15382 c15382 = new C15382(new C7343(), byteArrayOutputStream);
        try {
            c15382.m36819(c0939);
            c15382.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c5982.m27383(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c15382.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38527(AbstractC9032 abstractC9032) throws C0127 {
        boolean z = abstractC9032 instanceof C0938;
        int i = this.f52661;
        String str = this.f52660;
        if (z) {
            C0938 c0938 = (C0938) abstractC9032;
            if (c0938.m3699() == i) {
                AbstractC9032 abstractC9032M3697 = c0938.m3697();
                if (!(abstractC9032M3697 instanceof C4466)) {
                    throw new C0127("Expected a " + str + " (SEQUENCE), not: " + abstractC9032M3697);
                }
                for (AbstractC9032 abstractC9033 : (C4466) abstractC9032M3697) {
                    if (!(abstractC9033 instanceof C0938)) {
                        throw new C0127("Expected an ASN.1 TaggedObject as " + str + " contents, not: " + abstractC9033);
                    }
                    mo19116((C0938) abstractC9033);
                }
                return;
            }
        }
        throw new C0127("Expected to find the " + str + " (CHOICE [" + i + "]) header, not: " + abstractC9032);
    }
}
