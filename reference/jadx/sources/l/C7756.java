package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۟᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public class C7756 extends AbstractC9376 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Collection f25610;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f25611;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7756(C20456 c20456, InterfaceC4290 interfaceC4290, EnumC19730... enumC19730Arr) {
        super(interfaceC4290, enumC19730Arr);
        this.f25611 = c20456;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4921(EnumC19730 enumC19730, String str) {
        Collection collectionUnmodifiableCollection;
        if (!this.f31746.contains(enumC19730)) {
            return false;
        }
        this.f31745 = true;
        if (str == null) {
            collectionUnmodifiableCollection = null;
        } else {
            C10579 c10579Mo13719 = mo13719();
            c10579Mo13719.m26754(str);
            collectionUnmodifiableCollection = C0561.unmodifiableCollection(c10579Mo13719);
        }
        this.f25610 = collectionUnmodifiableCollection;
        return true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public Collection mo9021() {
        return this.f25610;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public void mo4918(Iterable iterable) {
        C10579 c10579Mo13718;
        if (iterable == null) {
            c10579Mo13718 = mo13718();
        } else {
            this.f31745 = true;
            C10579 c10579Mo13719 = mo13719();
            c10579Mo13719.m26753(iterable, c10579Mo13719.f36194.f66389);
            c10579Mo13718 = c10579Mo13719;
        }
        this.f25610 = C0561.unmodifiableCollection(c10579Mo13718);
    }

    /* JADX INFO: renamed from: ֨ */
    public C10579 mo13718() {
        C10579 c10579Mo13719 = mo13719();
        c10579Mo13719.m26754((String) null);
        return c10579Mo13719;
    }

    /* JADX INFO: renamed from: ۬ */
    public C10579 mo13719() {
        return new C10579(this.f25611);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4920(InterfaceC3800 interfaceC3800) {
        return C20456.m46266(this.f25611, this.f25610, interfaceC3800);
    }
}
