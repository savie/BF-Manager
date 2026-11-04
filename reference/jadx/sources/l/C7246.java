package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۜܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public class C7246 extends AbstractC16941 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f23891;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Collection f23892;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7246(C22185 c22185, InterfaceC24928 interfaceC24928, EnumC7687... enumC7687Arr) {
        super(interfaceC24928, enumC7687Arr);
        this.f23891 = c22185;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4671(EnumC7687 enumC7687, String str) {
        Collection collectionUnmodifiableCollection;
        if (!this.f55347.contains(enumC7687)) {
            return false;
        }
        this.f55346 = true;
        if (str == null) {
            collectionUnmodifiableCollection = null;
        } else {
            C8737 c8737Mo19875 = mo19875();
            c8737Mo19875.m23422(str);
            collectionUnmodifiableCollection = C4681.unmodifiableCollection(c8737Mo19875);
        }
        this.f23892 = collectionUnmodifiableCollection;
        return true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public Collection mo4675() {
        return this.f23892;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public void mo4669(Iterable iterable) {
        C8737 c8737Mo19876;
        if (iterable == null) {
            c8737Mo19876 = mo19876();
        } else {
            this.f55346 = true;
            C8737 c8737Mo19875 = mo19875();
            c8737Mo19875.m23421(iterable, c8737Mo19875.f28412.f71478);
            c8737Mo19876 = c8737Mo19875;
        }
        this.f23892 = C4681.unmodifiableCollection(c8737Mo19876);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8737 mo19876() {
        C8737 c8737Mo19875 = mo19875();
        c8737Mo19875.m23422((String) null);
        return c8737Mo19875;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8737 mo19875() {
        return new C8737(this.f23891);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4672(InterfaceC24329 interfaceC24329) {
        return C22185.m50187(this.f23891, this.f23892, interfaceC24329);
    }
}
