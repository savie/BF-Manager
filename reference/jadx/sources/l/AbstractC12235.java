package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12235 extends AbstractC4032 implements InterfaceC24170, InterfaceC20440 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f39383 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public HashSet f39387 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f39384 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f39386 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f39385 = null;

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ۙ */
    public final Set mo17931() {
        return null;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17938(HashSet hashSet) {
    }

    @Override // l.InterfaceC24170
    public final List getChildren() {
        return this.f39383;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14635(C18202 c18202) {
        this.f39383.add(c18202);
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ۙ */
    public final void mo17933(HashSet hashSet) {
        this.f39387 = hashSet;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ᩸ */
    public final Set mo17939() {
        return this.f39387;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ۙ */
    public final void mo17932(String str) {
        this.f39384 = str;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ᩷ */
    public final String mo17937() {
        return this.f39384;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ᩸ */
    public final void mo17940(HashSet hashSet) {
        this.f39386 = hashSet;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ᩴ */
    public final Set mo17936() {
        return this.f39386;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ۤ */
    public final void mo17934(HashSet hashSet) {
        this.f39385 = hashSet;
    }

    @Override // l.InterfaceC20440
    /* JADX INFO: renamed from: ܳ */
    public final Set mo17935() {
        return this.f39385;
    }
}
