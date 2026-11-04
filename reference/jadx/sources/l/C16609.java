package l;

/* JADX INFO: renamed from: l.ܺۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18941 f53715;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18941 f53716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f53717;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39295(C7660 c7660) {
        C18941 c18941 = this.f53715;
        if (c18941.f61428 != null) {
            c18941.f61428 = c7660;
        } else {
            this.f53716.f61428 = c7660;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7660 m39297() {
        Object obj = this.f53715.f61428;
        return obj != null ? (C7660) obj : (C7660) this.f53716.f61428;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7660 m39298() {
        Object obj = this.f53715.f61429;
        return obj != null ? (C7660) obj : (C7660) this.f53716.f61429;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39294() {
        if (this.f53717 == null) {
            this.f53717 = m39293();
        }
        return this.f53717;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m39293() {
        Object obj = this.f53716.f61428;
        if (obj == null) {
            return null;
        }
        Object obj2 = ((C10816) ((C7660) ((C24572) ((C7660) obj).f25232).f61224).f25232).f61224;
        this.f53717 = (String) obj2;
        return (String) obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39296(C15291 c15291) {
        Object obj;
        C18941 c18941 = this.f53716;
        C18941 c18942 = this.f53715;
        Object obj2 = c18942.f61428;
        if (obj2 != null && ((C7660) obj2).f67820 != ((C7660) c18941.f61428).f67820) {
            m39293();
            c15291.m36724((C7660) c18941.f61428);
        }
        Object obj3 = c18942.f61429;
        if (obj3 == null || (obj = c18941.f61429) == null) {
            return;
        }
        C7660 c7660 = (C7660) obj;
        if (((C7660) obj3).f67820 != c7660.f67820) {
            c15291.m36724(c7660);
        }
    }
}
