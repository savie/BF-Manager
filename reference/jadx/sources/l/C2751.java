package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86Y6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2751 extends AbstractC10868 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14042 f10554;

    public C2751(C14042 c14042) {
        super(c14042);
        this.f10554 = c14042;
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ */
    public final EnumC16512 mo1799(EnumC17217 enumC17217) {
        switch (C11925.f40019[enumC17217.ordinal()]) {
            case 1:
                return EnumC16512.SUPPORTED;
            case 2:
            case 3:
            case 4:
            case 5:
                return EnumC16512.BEST_EFFORT;
            case 6:
            case 7:
            case 8:
                return EnumC16512.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo8393() throws Throwable {
        IOException e;
        C7817 c7817Mo8443;
        C7817 c7817 = null;
        if (mo8394().m16196() != EnumC12279.MISSING) {
            throw C20040.m45395(EnumC17217.CREATE_FILE_EXCLUSIVE, EnumC15807.ALREADY_EXISTS, this.f36954.mo33986(), (String) null);
        }
        try {
            c7817Mo8443 = this.f10554.mo8443();
            try {
                try {
                    c7817Mo8443.m20591(this.f36954.mo33986(), false).close();
                    c7817Mo8443.f25728 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C20040.m45394(EnumC17217.CREATE_FILE_EXCLUSIVE, this.f36954.mo33986(), (String) null, e);
                }
            } catch (Throwable th) {
                C7817 c7818 = c7817Mo8443;
                th = th;
                c7817 = c7818;
                if (c7817 != null) {
                    c7817.f25728 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c7817Mo8443 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c7817 != null) {
                c7817.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5928 mo8394() throws C20040 {
        AbstractC20745 abstractC20745 = this.f36954;
        try {
            return m8387(abstractC20745, this.f10554.m33990());
        } catch (IOException e) {
            C20040 c20040M45394 = C20040.m45394(EnumC17217.STAT, abstractC20745.mo33986(), (String) null, e);
            if (c20040M45394.m45399() == EnumC15807.NOT_FOUND) {
                return C5928.m16193(abstractC20745);
            }
            throw c20040M45394;
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List mo8397() {
        return m8386(false);
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List mo8389() {
        return m8386(true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m8386(boolean z) throws Throwable {
        C7817 c7817Mo8443;
        List<C5574> listM20576;
        m8388(mo8394(), EnumC17217.LIST);
        C7817 c7817 = null;
        try {
            try {
                c7817Mo8443 = this.f10554.mo8443();
                try {
                    if (z) {
                        listM20576 = c7817Mo8443.m20574(this.f36954.mo33986());
                    } else {
                        listM20576 = c7817Mo8443.m20576(this.f36954.mo33986(), true);
                    }
                    ArrayList arrayList = new ArrayList(listM20576.size());
                    for (C5574 c5574 : listM20576) {
                        arrayList.add(m8387(this.f10554.mo8446(c5574), c5574));
                    }
                    if (c7817Mo8443 != null) {
                        c7817Mo8443.f25728 = 0L;
                    }
                    return arrayList;
                } catch (IOException e) {
                    e = e;
                    throw C20040.m45394(EnumC17217.LIST, this.f36954.mo33986(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c7817 = c7817Mo8443;
                if (c7817 != null) {
                    c7817.f25728 = 0L;
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            c7817Mo8443 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c7817 != null) {
                c7817.f25728 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0038: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:19:0x0038 */
    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo8395() throws Throwable {
        IOException e;
        C7817 c7817;
        C7817 c7818 = null;
        if (mo8394().m16196() != EnumC12279.MISSING) {
            throw C20040.m45395(EnumC17217.CREATE_DIRECTORY_SINGLE, EnumC15807.ALREADY_EXISTS, this.f36954.mo33986(), (String) null);
        }
        try {
            try {
                C7817 c7817Mo8443 = this.f10554.mo8443();
                try {
                    c7817Mo8443.m20602(this.f36954.mo33986(), false);
                    c7817Mo8443.f25728 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C20040.m45394(EnumC17217.CREATE_DIRECTORY_SINGLE, this.f36954.mo33986(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c7818 = c7817;
                if (c7818 != null) {
                    c7818.f25728 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c7818 != null) {
                c7818.f25728 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo8392() throws Throwable {
        IOException e;
        C7817 c7817Mo8443;
        C5928 c5928Mo8394 = mo8394();
        C7817 c7817 = null;
        if (c5928Mo8394.m16196() == EnumC12279.MISSING) {
            throw C20040.m45395(EnumC17217.DELETE_FILE_OR_LINK, EnumC15807.NOT_FOUND, this.f36954.mo33986(), (String) null);
        }
        if (c5928Mo8394.m16196() != EnumC12279.REGULAR && c5928Mo8394.m16196() != EnumC12279.LINK) {
            throw C20040.m45395(EnumC17217.DELETE_FILE_OR_LINK, EnumC15807.NOT_REGULAR_FILE, this.f36954.mo33986(), (String) null);
        }
        try {
            c7817Mo8443 = this.f10554.mo8443();
            try {
                try {
                    c7817Mo8443.m20607(this.f36954.mo33986());
                    this.f10554.mo24648();
                    c7817Mo8443.f25728 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C20040.m45394(EnumC17217.DELETE_FILE_OR_LINK, this.f36954.mo33986(), (String) null, e);
                }
            } catch (Throwable th) {
                c7817 = c7817Mo8443;
                th = th;
                if (c7817 != null) {
                    c7817.f25728 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c7817Mo8443 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c7817 != null) {
                c7817.f25728 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:17:0x0039 */
    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo8390() throws Throwable {
        IOException e;
        C7817 c7817;
        m8388(mo8394(), EnumC17217.DELETE_EMPTY_DIRECTORY);
        C7817 c7818 = null;
        try {
            try {
                C7817 c7817Mo8443 = this.f10554.mo8443();
                try {
                    c7817Mo8443.m20604(this.f36954.mo33986());
                    this.f10554.mo24648();
                    c7817Mo8443.f25728 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C20040.m45394(EnumC17217.DELETE_EMPTY_DIRECTORY, this.f36954.mo33986(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c7818 = c7817;
                if (c7818 != null) {
                    c7818.f25728 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c7818 != null) {
                c7818.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8391(AbstractC20745 abstractC20745) throws C20040 {
        if (!abstractC20745.mo33979()) {
            throw C20040.m45395(EnumC17217.RENAME_NO_REPLACE, EnumC15807.CROSS_BACKEND, this.f36954.mo33986(), abstractC20745.mo33986());
        }
        EnumC12279 enumC12279M16196 = mo8394().m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        if (enumC12279M16196 == enumC12279) {
            throw C20040.m45395(EnumC17217.RENAME_NO_REPLACE, EnumC15807.NOT_FOUND, this.f36954.mo33986(), abstractC20745.mo33986());
        }
        if (abstractC20745.mo33989().mo8394().m16196() != enumC12279) {
            throw C20040.m45395(EnumC17217.RENAME_NO_REPLACE, EnumC15807.ALREADY_EXISTS, this.f36954.mo33986(), abstractC20745.mo33986());
        }
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = this.f10554.mo8443();
                c7817Mo8443.m20594(this.f36954.mo33986(), abstractC20745.mo33986());
                this.f10554.mo24648();
                if (abstractC20745 instanceof C14042) {
                    ((C14042) abstractC20745).mo24648();
                }
                c7817Mo8443.f25728 = 0L;
            } catch (IOException e) {
                throw C20040.m45394(EnumC17217.RENAME_NO_REPLACE, this.f36954.mo33986(), abstractC20745.mo33986(), e);
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10868
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo8396(AbstractC20745 abstractC20745) throws C20040 {
        if (!abstractC20745.mo33979()) {
            throw C20040.m45395(EnumC17217.REPLACE, EnumC15807.CROSS_BACKEND, this.f36954.mo33986(), abstractC20745.mo33986());
        }
        if (mo8394().m16196() == EnumC12279.MISSING) {
            throw C20040.m45395(EnumC17217.REPLACE, EnumC15807.NOT_FOUND, this.f36954.mo33986(), abstractC20745.mo33986());
        }
        C7817 c7817Mo8443 = null;
        try {
            try {
                c7817Mo8443 = this.f10554.mo8443();
                c7817Mo8443.m20594(this.f36954.mo33986(), abstractC20745.mo33986());
                this.f10554.mo24648();
                if (abstractC20745 instanceof C14042) {
                    ((C14042) abstractC20745).mo24648();
                }
                c7817Mo8443.f25728 = 0L;
            } catch (IOException e) {
                throw C20040.m45394(EnumC17217.REPLACE, this.f36954.mo33986(), abstractC20745.mo33986(), e);
            }
        } catch (Throwable th) {
            if (c7817Mo8443 != null) {
                c7817Mo8443.f25728 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5928 m8387(AbstractC20745 abstractC20745, C5574 c5574) {
        EnumC12279 enumC12279;
        char cM15393 = c5574.m15393();
        if (cM15393 == 'l') {
            enumC12279 = EnumC12279.LINK;
        } else if (cM15393 == '-') {
            enumC12279 = EnumC12279.REGULAR;
        } else if (cM15393 == 'd') {
            enumC12279 = EnumC12279.DIRECTORY;
        } else {
            enumC12279 = EnumC12279.OTHER;
        }
        EnumC12279 enumC122710 = enumC12279;
        return new C5928(abstractC20745, enumC122710, enumC122710 == EnumC12279.DIRECTORY ? -1L : c5574.m15391(), c5574.m15394(), enumC122710 == EnumC12279.LINK ? c5574.m15397() : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8388(C5928 c5928, EnumC17217 enumC17217) throws C20040 {
        EnumC12279 enumC12279M16196 = c5928.m16196();
        EnumC12279 enumC12279 = EnumC12279.MISSING;
        AbstractC20745 abstractC20745 = this.f36954;
        if (enumC12279M16196 == enumC12279) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_FOUND, abstractC20745.mo33986(), (String) null);
        }
        if (c5928.m16196() != EnumC12279.DIRECTORY) {
            throw C20040.m45395(enumC17217, EnumC15807.NOT_DIRECTORY, abstractC20745.mo33986(), (String) null);
        }
    }
}
