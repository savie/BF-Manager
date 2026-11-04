package l;

import java.io.Closeable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83ZS */
/* JADX INFO: loaded from: classes.dex */
public final class C24776 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Set f80182;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f80183;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7312 f80184;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Map f80185;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Set f80186;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Set f80187;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Set f80188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f80189;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC16722 f80190;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Set f80191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f80192;

    public final String toString() {
        return "javac Filer";
    }

    public C24776(C4747 c4747) {
        this.f80190 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        C2466.m8318(c4747);
        this.f80184 = C7312.m20023(c4747);
        C19881.m45741(c4747);
        C15252.m36599(c4747);
        C14764.m35506(c4747);
        this.f80187 = C4681.synchronizedSet(new LinkedHashSet());
        this.f80182 = C4681.synchronizedSet(new LinkedHashSet());
        this.f80188 = C4681.synchronizedSet(new LinkedHashSet());
        this.f80191 = C4681.synchronizedSet(new LinkedHashSet());
        this.f80185 = C4681.synchronizedMap(new LinkedHashMap());
        this.f80186 = C4681.synchronizedSet(new LinkedHashSet());
        this.f80192 = new LinkedHashSet();
        this.f80189 = new LinkedHashSet();
        this.f80183 = new LinkedHashSet();
        C15400.m36873(c4747).m36878(EnumC19876.PROCESSING);
        C13015.m32421(c4747).m32423(EnumC7687.f25315);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m55301() {
        return (this.f80188.isEmpty() && this.f80185.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set m55304() {
        return this.f80191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m55299() {
        return this.f80185;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m55302() {
        Set set = this.f80186;
        if (set.isEmpty()) {
            return;
        }
        C25213 c25213 = C13146.f42046;
        this.f80184.m34529(new C25213("compiler", "proc.unclosed.type.files", set));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55300(Collection collection, Collection collection2) {
        this.f80187.addAll(collection);
        this.f80183.addAll(collection2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f80188.clear();
        this.f80191.clear();
        this.f80185.clear();
        this.f80183.clear();
        this.f80187.clear();
        this.f80182.clear();
        this.f80186.clear();
        this.f80192.clear();
        this.f80189.clear();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m55303() {
        this.f80188.clear();
        this.f80191.clear();
        this.f80185.clear();
    }
}
