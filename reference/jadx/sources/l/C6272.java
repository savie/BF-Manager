package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public class C6272 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f21257;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C2455 f21258;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C2455 f21259;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo12168() {
        return false;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5720;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("saveAsPath"), C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        m41562(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        String strM41585 = m41585("inputPath1");
        String strM41586 = m41585("inputPath2");
        String strM41565 = m41565("zipPath1");
        String strM41566 = m41565("zipPath2");
        AbstractC12233 abstractC12233 = m41580().containsKey("statelessVisitor1") ? (AbstractC12233) C14616.m35094(m41553("statelessVisitor1"), false) : null;
        AbstractC12233 abstractC12234 = m41580().containsKey("statelessVisitor2") ? (AbstractC12233) C14616.m35094(m41553("statelessVisitor2"), false) : null;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean z = strM41565 == null || strM41566 == null;
        boolean z2 = strM41565 == null && strM41566 == null;
        if (strM41565 != null) {
            C2455 c2455 = new C2455(strM41565);
            this.f21259 = c2455;
            C11212.m28156(map, c2455, strM41585, z);
            strM41585 = strM41565.concat(strM41585);
        } else if (abstractC12233 != null) {
            C11212.m28157(map, abstractC12233, strM41585, z2, "", this);
            strM41585 = abstractC12233.m30350() + strM41585;
        } else {
            C11212.m28159(map, C5553.m15313(strM41585, new String[0]), z2, "", this);
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        if (strM41566 != null) {
            C2455 c2456 = new C2455(strM41566);
            this.f21258 = c2456;
            C11212.m28156(map2, c2456, strM41586, z);
            strM41586 = strM41566.concat(strM41586);
        } else if (abstractC12234 != null) {
            C11212.m28157(map2, abstractC12234, strM41586, z2, "", this);
            strM41586 = abstractC12234.m30350() + strM41586;
        } else {
            C11212.m28159(map2, C5553.m15313(strM41586, new String[0]), z2, "", this);
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        this.f21257 = C7608.m20143(strM41585, strM41586, map, map2, new C17561(this));
        return m41583();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            if (this.f21257.isEmpty()) {
                C15829.m37618(R.string.MT_Protector);
                return;
            }
            String str = this.f21257;
            String strM39288 = C16737.m39288(R.string.MT_Protector);
            String strM41585 = m41585("saveAsPath");
            int i = C12859.f42771;
            ActivityC21135.m47562(main, str, strM39288, strM41585, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C19431.m44468(this.f21259);
        C19431.m44468(this.f21258);
        C21094.m47530();
    }
}
