package l;

import java.io.Closeable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 83ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11885 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC13464 f39869;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f39870;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Set f39871;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f39872;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Map f39873;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20414 f39874;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f39875;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set f39876;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Set f39877;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f39878;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Set f39879;

    public final String toString() {
        return "javac Filer";
    }

    public C11885(C12343 c12343) {
        this.f39869 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        C16202.m38303(c12343);
        this.f39874 = C20414.m46161(c12343);
        C12325.m30599(c12343);
        C23942.m52776(c12343);
        C3836.m11131(c12343);
        this.f39879 = C0561.synchronizedSet(new LinkedHashSet());
        this.f39876 = C0561.synchronizedSet(new LinkedHashSet());
        this.f39871 = C0561.synchronizedSet(new LinkedHashSet());
        this.f39877 = C0561.synchronizedSet(new LinkedHashSet());
        this.f39873 = C0561.synchronizedMap(new LinkedHashMap());
        this.f39870 = C0561.synchronizedSet(new LinkedHashSet());
        this.f39878 = new LinkedHashSet();
        this.f39875 = new LinkedHashSet();
        this.f39872 = new LinkedHashSet();
        C16826.m39463(c12343).m39467(EnumC0597.PROCESSING);
        C14770.m35395(c12343).m35398(EnumC19730.f63344);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m29642() {
        return (this.f39871.isEmpty() && this.f39873.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set m29645() {
        return this.f39877;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m29643() {
        return this.f39873;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m29641() {
        Set set = this.f39870;
        if (set.isEmpty()) {
            return;
        }
        C14065 c14065 = C9768.f32836;
        this.f39874.m48201(new C14065("compiler", "proc.unclosed.type.files", set));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29644(Collection collection, Collection collection2) {
        this.f39879.addAll(collection);
        this.f39872.addAll(collection2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39871.clear();
        this.f39877.clear();
        this.f39873.clear();
        this.f39872.clear();
        this.f39879.clear();
        this.f39876.clear();
        this.f39870.clear();
        this.f39878.clear();
        this.f39875.clear();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m29646() {
        this.f39871.clear();
        this.f39877.clear();
        this.f39873.clear();
    }
}
