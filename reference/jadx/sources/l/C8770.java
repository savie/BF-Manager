package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۡۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8770 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f30171;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f30172;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f30173;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile String f30174;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f30177;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final String f30178;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f30179;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30180;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f30182;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f30183;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f30184;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f30175 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f30176 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f30181 = "preview-" + UUID.randomUUID() + ".appassets.androidplatform.net";

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f30170 = UUID.randomUUID().toString();

    public C8770(AbstractC9677 abstractC9677, String str, String str2, String str3, String str4, boolean z, boolean z2, AbstractC20745 abstractC20745, boolean z3) {
        this.f30173 = abstractC9677;
        this.f30179 = str;
        this.f30177 = str2;
        this.f30178 = str3;
        this.f30172 = str4;
        this.f30182 = z;
        this.f30184 = z2;
        this.f30171 = abstractC20745;
        this.f30183 = z3;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C8064 c8064 = ActivityC10181.f34767;
        Object obj = this.f30173;
        if (obj instanceof AutoCloseable) {
            try {
                C9023.m23359((AutoCloseable) obj);
            } catch (Exception unused) {
            }
        }
        Iterator it = this.f30175.iterator();
        while (it.hasNext()) {
            AbstractC11462.m28611(((Long) it.next()).longValue());
        }
        AbstractC20745 abstractC20745 = this.f30171;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
    }
}
