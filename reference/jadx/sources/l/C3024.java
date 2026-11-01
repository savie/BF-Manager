package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C3024 extends AbstractC9376 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f11328;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11329;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumMap f11330;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Collection f11331;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3024(C20456 c20456) {
        super(EnumC3584.PLATFORM_CLASS_PATH, EnumC19730.f63327, EnumC19730.f63405, EnumC19730.f63326, EnumC19730.f63373, EnumC19730.f63351, EnumC19730.f63383, EnumC19730.f63356, EnumC19730.f63386);
        this.f11328 = c20456;
        this.f11330 = new EnumMap(EnumC19730.class);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        if (!this.f31746.contains(enumC19730)) {
            return false;
        }
        this.f31745 = true;
        int i = C1613.f6506[enumC19730.ordinal()];
        if (i == 1) {
            enumC19730 = EnumC19730.f63327;
        } else if (i == 2) {
            enumC19730 = EnumC19730.f63351;
        } else if (i == 3) {
            enumC19730 = EnumC19730.f63356;
        }
        EnumMap enumMap = this.f11330;
        enumMap.put(enumC19730, str);
        if (enumC19730 == EnumC19730.f63327) {
            enumMap.remove(EnumC19730.f63326);
            enumMap.remove(EnumC19730.f63373);
        }
        this.f11331 = null;
        return true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4918(Iterable iterable) {
        if (iterable == null) {
            this.f11331 = null;
            return;
        }
        this.f11329 = false;
        this.f31745 = true;
        C10579 c10579 = new C10579(this.f11328);
        c10579.m26753(iterable, false);
        this.f11331 = C0561.unmodifiableCollection(c10579);
        this.f11330.clear();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10579 m9020() {
        Iterable iterableSingleton;
        C20456 c20456 = this.f11328;
        C10579 c10579 = new C10579(c20456);
        EnumC19730 enumC19730 = EnumC19730.f63327;
        EnumMap enumMap = this.f11330;
        String str = (String) enumMap.get(enumC19730);
        String str2 = (String) enumMap.get(EnumC19730.f63351);
        String str3 = (String) enumMap.get(EnumC19730.f63356);
        String str4 = (String) enumMap.get(EnumC19730.f63326);
        String str5 = (String) enumMap.get(EnumC19730.f63373);
        c10579.m26754(str4);
        boolean z = false;
        if (str2 != null) {
            c10579.m26755(str2, c20456.f66389);
        } else {
            c10579.m26755(System.getProperty("java.endorsed.dirs"), false);
        }
        if (str != null) {
            c10579.m26754(str);
        } else {
            InterfaceC3800 interfaceC3800 = C20456.f66386;
            if (C5212.isRegularFile(interfaceC3800, new EnumC22146[0])) {
                iterableSingleton = Collections.singleton(interfaceC3800);
            } else {
                InterfaceC3800 interfaceC3800Resolve = C20456.f66385.resolve("modules");
                if (C5212.isDirectory(interfaceC3800Resolve.resolve("java.base"), new EnumC22146[0])) {
                    InterfaceC5046 list = C5212.list(interfaceC3800Resolve);
                    try {
                        List list2 = list.toList();
                        list.close();
                        iterableSingleton = list2;
                    } catch (Throwable th) {
                        if (list != null) {
                            try {
                                list.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } else {
                    iterableSingleton = null;
                }
            }
            if (iterableSingleton != null) {
                c10579.m26753(iterableSingleton, false);
            } else {
                c10579.m26759(System.getProperty("sun.boot.class.path"), false);
            }
        }
        c10579.m26754(str5);
        if (str3 != null) {
            c10579.m26755(str3, c20456.f66389);
        } else {
            InterfaceC3800 interfaceC3800Resolve2 = C20456.f66385.resolve("lib/jfxrt.jar");
            if (C5212.exists(interfaceC3800Resolve2, new EnumC22146[0])) {
                c10579.m26757(interfaceC3800Resolve2, false);
            }
            c10579.m26755(System.getProperty("java.ext.dirs"), false);
        }
        if (str4 == null && str == null && str5 == null) {
            z = true;
        }
        this.f11329 = z;
        return c10579;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Collection mo9021() {
        if (this.f11331 == null) {
            try {
                this.f11331 = C0561.unmodifiableCollection(m9020());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f11331;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m9022() {
        if (this.f11331 == null) {
            try {
                this.f11331 = C0561.unmodifiableCollection(m9020());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f11329;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) {
        return C20456.m46266(this.f11328, this.f11331, interfaceC3800);
    }
}
