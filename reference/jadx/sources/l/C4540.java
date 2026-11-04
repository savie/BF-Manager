package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4540 extends AbstractC11601 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7302 f16145;

    public C4540(C7302 c7302) {
        super(c7302);
        this.f16145 = c7302;
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15330 mo8788(EnumC5636 enumC5636) {
        switch (C14013.f44382[enumC5636.ordinal()]) {
            case 1:
                return EnumC15330.SUPPORTED;
            case 2:
            case 3:
            case 4:
            case 5:
                return EnumC15330.BEST_EFFORT;
            case 6:
            case 7:
            case 8:
                return EnumC15330.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۤ */
    public final void mo8791() throws Throwable {
        IOException e;
        C15945 c15945Mo19986;
        C15945 c15945 = null;
        if (mo8790().m6567() != EnumC13093.MISSING) {
            throw C22790.m51406(EnumC5636.CREATE_FILE_EXCLUSIVE, EnumC10855.ALREADY_EXISTS, this.f36428.mo4294(), (String) null);
        }
        try {
            c15945Mo19986 = this.f16145.mo19986();
            try {
                try {
                    c15945Mo19986.m38037(this.f36428.mo4294(), false).close();
                    c15945Mo19986.f51784 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22790.m51405(EnumC5636.CREATE_FILE_EXCLUSIVE, this.f36428.mo4294(), (String) null, e);
                }
            } catch (Throwable th) {
                C15945 c15946 = c15945Mo19986;
                th = th;
                c15945 = c15946;
                if (c15945 != null) {
                    c15945.f51784 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c15945Mo19986 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c15945 != null) {
                c15945.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۚ */
    public final C1907 mo8790() throws C22790 {
        AbstractC22044 abstractC22044 = this.f36428;
        try {
            return m14279(abstractC22044, this.f16145.m19984());
        } catch (IOException e) {
            C22790 c22790M51405 = C22790.m51405(EnumC5636.STAT, abstractC22044.mo4294(), (String) null, e);
            if (c22790M51405.m51409() == EnumC10855.NOT_FOUND) {
                return C1907.m6564(abstractC22044);
            }
            throw c22790M51405;
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ܳ */
    public final List mo8792() {
        return m14278(false);
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List mo14281() {
        return m14278(true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m14278(boolean z) throws Throwable {
        C15945 c15945Mo19986;
        List<C21694> listM38021;
        m14280(mo8790(), EnumC5636.LIST);
        C15945 c15945 = null;
        try {
            try {
                c15945Mo19986 = this.f16145.mo19986();
                try {
                    if (z) {
                        listM38021 = c15945Mo19986.m38059(this.f36428.mo4294());
                    } else {
                        listM38021 = c15945Mo19986.m38021(this.f36428.mo4294(), true);
                    }
                    ArrayList arrayList = new ArrayList(listM38021.size());
                    for (C21694 c21694 : listM38021) {
                        arrayList.add(m14279(this.f16145.mo19979(c21694), c21694));
                    }
                    if (c15945Mo19986 != null) {
                        c15945Mo19986.f51784 = 0L;
                    }
                    return arrayList;
                } catch (IOException e) {
                    e = e;
                    throw C22790.m51405(EnumC5636.LIST, this.f36428.mo4294(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c15945 = c15945Mo19986;
                if (c15945 != null) {
                    c15945.f51784 = 0L;
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            c15945Mo19986 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c15945 != null) {
                c15945.f51784 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0038: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:19:0x0038 */
    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8794() throws Throwable {
        IOException e;
        C15945 c15945;
        C15945 c15946 = null;
        if (mo8790().m6567() != EnumC13093.MISSING) {
            throw C22790.m51406(EnumC5636.CREATE_DIRECTORY_SINGLE, EnumC10855.ALREADY_EXISTS, this.f36428.mo4294(), (String) null);
        }
        try {
            try {
                C15945 c15945Mo19986 = this.f16145.mo19986();
                try {
                    c15945Mo19986.m38056(this.f36428.mo4294(), false);
                    c15945Mo19986.f51784 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22790.m51405(EnumC5636.CREATE_DIRECTORY_SINGLE, this.f36428.mo4294(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c15946 = c15945;
                if (c15946 != null) {
                    c15946.f51784 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c15946 != null) {
                c15946.f51784 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8793() throws Throwable {
        IOException e;
        C15945 c15945Mo19986;
        C1907 c1907Mo8790 = mo8790();
        C15945 c15945 = null;
        if (c1907Mo8790.m6567() == EnumC13093.MISSING) {
            throw C22790.m51406(EnumC5636.DELETE_FILE_OR_LINK, EnumC10855.NOT_FOUND, this.f36428.mo4294(), (String) null);
        }
        if (c1907Mo8790.m6567() != EnumC13093.REGULAR && c1907Mo8790.m6567() != EnumC13093.LINK) {
            throw C22790.m51406(EnumC5636.DELETE_FILE_OR_LINK, EnumC10855.NOT_REGULAR_FILE, this.f36428.mo4294(), (String) null);
        }
        try {
            c15945Mo19986 = this.f16145.mo19986();
            try {
                try {
                    c15945Mo19986.m38047(this.f36428.mo4294());
                    this.f16145.mo15568();
                    c15945Mo19986.f51784 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22790.m51405(EnumC5636.DELETE_FILE_OR_LINK, this.f36428.mo4294(), (String) null, e);
                }
            } catch (Throwable th) {
                c15945 = c15945Mo19986;
                th = th;
                if (c15945 != null) {
                    c15945.f51784 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c15945Mo19986 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c15945 != null) {
                c15945.f51784 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:17:0x0039 */
    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩸ */
    public final void mo8796() throws Throwable {
        IOException e;
        C15945 c15945;
        m14280(mo8790(), EnumC5636.DELETE_EMPTY_DIRECTORY);
        C15945 c15946 = null;
        try {
            try {
                C15945 c15945Mo19986 = this.f16145.mo19986();
                try {
                    c15945Mo19986.m38046(this.f36428.mo4294());
                    this.f16145.mo15568();
                    c15945Mo19986.f51784 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22790.m51405(EnumC5636.DELETE_EMPTY_DIRECTORY, this.f36428.mo4294(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c15946 = c15945;
                if (c15946 != null) {
                    c15946.f51784 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c15946 != null) {
                c15946.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ۙ */
    public final void mo8789(AbstractC22044 abstractC22044) throws C22790 {
        if (!abstractC22044.mo19981()) {
            throw C22790.m51406(EnumC5636.RENAME_NO_REPLACE, EnumC10855.CROSS_BACKEND, this.f36428.mo4294(), abstractC22044.mo4294());
        }
        EnumC13093 enumC13093M6567 = mo8790().m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        if (enumC13093M6567 == enumC13093) {
            throw C22790.m51406(EnumC5636.RENAME_NO_REPLACE, EnumC10855.NOT_FOUND, this.f36428.mo4294(), abstractC22044.mo4294());
        }
        if (abstractC22044.mo4298().mo8790().m6567() != enumC13093) {
            throw C22790.m51406(EnumC5636.RENAME_NO_REPLACE, EnumC10855.ALREADY_EXISTS, this.f36428.mo4294(), abstractC22044.mo4294());
        }
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = this.f16145.mo19986();
                c15945Mo19986.m38039(this.f36428.mo4294(), abstractC22044.mo4294());
                this.f16145.mo15568();
                if (abstractC22044 instanceof C7302) {
                    ((C7302) abstractC22044).mo15568();
                }
                c15945Mo19986.f51784 = 0L;
            } catch (IOException e) {
                throw C22790.m51405(EnumC5636.RENAME_NO_REPLACE, this.f36428.mo4294(), abstractC22044.mo4294(), e);
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC11601
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8795(AbstractC22044 abstractC22044) throws C22790 {
        if (!abstractC22044.mo19981()) {
            throw C22790.m51406(EnumC5636.REPLACE, EnumC10855.CROSS_BACKEND, this.f36428.mo4294(), abstractC22044.mo4294());
        }
        if (mo8790().m6567() == EnumC13093.MISSING) {
            throw C22790.m51406(EnumC5636.REPLACE, EnumC10855.NOT_FOUND, this.f36428.mo4294(), abstractC22044.mo4294());
        }
        C15945 c15945Mo19986 = null;
        try {
            try {
                c15945Mo19986 = this.f16145.mo19986();
                c15945Mo19986.m38039(this.f36428.mo4294(), abstractC22044.mo4294());
                this.f16145.mo15568();
                if (abstractC22044 instanceof C7302) {
                    ((C7302) abstractC22044).mo15568();
                }
                c15945Mo19986.f51784 = 0L;
            } catch (IOException e) {
                throw C22790.m51405(EnumC5636.REPLACE, this.f36428.mo4294(), abstractC22044.mo4294(), e);
            }
        } catch (Throwable th) {
            if (c15945Mo19986 != null) {
                c15945Mo19986.f51784 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1907 m14279(AbstractC22044 abstractC22044, C21694 c21694) {
        EnumC13093 enumC13093;
        char cM49239 = c21694.m49239();
        if (cM49239 == 'l') {
            enumC13093 = EnumC13093.LINK;
        } else if (cM49239 == '-') {
            enumC13093 = EnumC13093.REGULAR;
        } else if (cM49239 == 'd') {
            enumC13093 = EnumC13093.DIRECTORY;
        } else {
            enumC13093 = EnumC13093.OTHER;
        }
        EnumC13093 enumC13094 = enumC13093;
        return new C1907(abstractC22044, enumC13094, enumC13094 == EnumC13093.DIRECTORY ? -1L : c21694.m49232(), c21694.m49236(), enumC13094 == EnumC13093.LINK ? c21694.m49240() : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14280(C1907 c1907, EnumC5636 enumC5636) throws C22790 {
        EnumC13093 enumC13093M6567 = c1907.m6567();
        EnumC13093 enumC13093 = EnumC13093.MISSING;
        AbstractC22044 abstractC22044 = this.f36428;
        if (enumC13093M6567 == enumC13093) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_FOUND, abstractC22044.mo4294(), (String) null);
        }
        if (c1907.m6567() != EnumC13093.DIRECTORY) {
            throw C22790.m51406(enumC5636, EnumC10855.NOT_DIRECTORY, abstractC22044.mo4294(), (String) null);
        }
    }
}
