package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5933 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10873 f20195;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f20196;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22161 f20197;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC10167 f20198;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f20199;

    public C5933(C10873 c10873, AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        this.f20195 = c10873;
        this.f20196 = predicate;
        this.f20198 = enumC10167;
        C22161 c22161M27242 = c10873.m27242(abstractC11242, predicate);
        this.f20197 = c22161M27242;
        C10873 c10874 = c22161M27242.f72487;
        this.f20199 = c10874 != null ? c10874.f36966 : -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C22161 c22161 = this.f20197;
        C10873 c10873 = c22161.f72487;
        if (c10873 != null && this.f20199 != c10873.f36966 && !c10873.mo9331(c22161.f72486)) {
            this.f20197 = this.f20197.m49172(this.f20196);
        }
        C10873 c10874 = this.f20197.f72487;
        if (c10874 != null) {
            return this.f20198 == EnumC10167.RECURSIVE || c10874 == this.f20195;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22161 c22161 = this.f20197;
        this.f20197 = c22161.m49172(this.f20196);
        return c22161.f72486;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
