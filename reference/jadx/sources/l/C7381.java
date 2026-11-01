package l;

import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7381 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4695 f24484;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f24485;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f24486;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f24487;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f24488;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C0219 f24483 = new C0219();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C4695 f24482 = new C4695(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10204 m19648(String str, boolean z) throws IOException {
        String strMo33968;
        HashSet hashSet = null;
        for (int i = 0; i <= 64; i++) {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            String strMo24643 = abstractC20745M15313.mo24643();
            if (hashSet != null && !hashSet.add(strMo24643)) {
                throw new IOException("Symbolic link cycle in hex target");
            }
            if (z && (abstractC20745M15313 instanceof C14042)) {
                C5574 c5574M33984 = ((C14042) abstractC20745M15313).m33984();
                if (c5574M33984.m15393() != 'l') {
                    strMo33968 = null;
                } else {
                    strMo33968 = c5574M33984.m15397();
                    if (strMo33968 == null) {
                        throw new IOException("Hex target link metadata is unavailable");
                    }
                }
            } else {
                strMo33968 = abstractC20745M15313.mo33968();
            }
            if (strMo33968 == null) {
                return new C10204(abstractC20745M15313, strMo24643);
            }
            if (hashSet == null) {
                hashSet = new HashSet();
                hashSet.add(strMo24643);
            }
            if (i == 64) {
                throw new IOException("Too many symbolic links in hex target");
            }
            if (!strMo33968.startsWith("/")) {
                AbstractC20745 abstractC20745M46689 = abstractC20745M15313.m46689();
                while (true) {
                    if (abstractC20745M46689 != null) {
                        if (strMo33968.isEmpty() || strMo33968.equals(".")) {
                            str = abstractC20745M46689.mo33986();
                            break;
                        }
                        if (strMo33968.equals("..")) {
                            str = abstractC20745M46689.getParent();
                            break;
                        }
                        if (strMo33968.startsWith("./")) {
                            strMo33968 = strMo33968.substring(2);
                        } else if (strMo33968.startsWith("../")) {
                            strMo33968 = strMo33968.substring(3);
                            abstractC20745M46689 = abstractC20745M46689.m46689();
                        } else {
                            str = abstractC20745M46689.m46690(strMo33968).mo33986();
                            break;
                        }
                    } else {
                        str = abstractC20745M15313.mo33986();
                        break;
                    }
                }
            } else {
                str = strMo33968;
            }
            if (str == null) {
                throw new C8599();
            }
        }
        throw new IOException("Too many symbolic links in hex target");
    }

    public C7381(String str, C10204 c10204, C4695 c4695) {
        this.f24485 = str;
        this.f24487 = c10204.f34854;
        AbstractC20745 abstractC20745 = c10204.f34853;
        this.f24488 = abstractC20745;
        this.f24484 = c4695;
        this.f24486 = abstractC20745.m46725();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7381 m19649(AbstractC20745 abstractC20745) {
        C13638.requireNonNull(abstractC20745, "openedFile");
        if (abstractC20745.m46725()) {
            return m19646(abstractC20745);
        }
        return m19645(abstractC20745.mo33986(), (String) null, (C4695) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7381 m19647(AbstractC20745 abstractC20745, String str, C4695 c4695) {
        C13638.requireNonNull(abstractC20745, "openedFile");
        if (abstractC20745.m46725()) {
            return m19646(abstractC20745);
        }
        return m19645(abstractC20745.mo33986(), str, c4695);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7381 m19650(AbstractC20745 abstractC20745, String str, C4695 c4695) throws IOException {
        C13638.requireNonNull(abstractC20745, "openedFile");
        if (!abstractC20745.m46725()) {
            try {
                return new C7381(abstractC20745.mo33986(), new C10204(C5553.m15313(str, new String[0]), str), c4695);
            } catch (RuntimeException e) {
                throw new IOException("Unable to restore deferred hex target", e);
            }
        }
        return m19646(abstractC20745);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19652() {
        return this.f24485;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m19654() {
        return this.f24487;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m19655() {
        return this.f24488;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4695 m19651() {
        return this.f24484;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19656() throws IOException {
        C4695 c4695 = this.f24484;
        if (this.f24486) {
            return;
        }
        try {
            C10204 c10204M19648 = m19648(this.f24485, true);
            if (!this.f24487.equals(c10204M19648.f34854)) {
                throw new C8599();
            }
            if (!c4695.equals(m19644(c10204M19648.f34853, c4695))) {
                throw new C8599();
            }
        } catch (RuntimeException e) {
            throw new IOException("Unable to validate hex target", e);
        } catch (C8599 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new IOException("Unable to validate hex target", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7381 m19646(AbstractC20745 abstractC20745) {
        return new C7381(abstractC20745.mo33986(), new C10204(abstractC20745, abstractC20745.mo24643()), f24482);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7381 m19645(String str, String str2, C4695 c4695) throws IOException {
        C10204 c10204M19648 = m19648(str, false);
        String str3 = c10204M19648.f34854;
        AbstractC20745 abstractC20745 = c10204M19648.f34853;
        if (abstractC20745.m46725()) {
            return new C7381(str, c10204M19648, f24482);
        }
        if (str2 != null && !str2.equals(str3)) {
            throw new C8599();
        }
        if (!abstractC20745.mo33988() || !abstractC20745.mo33971()) {
            throw new IOException("File can not be read");
        }
        long jMo33964 = abstractC20745.mo33964();
        if (jMo33964 < 0) {
            throw new IOException("Hex target length is unavailable");
        }
        C4695 c4696 = new C4695(jMo33964, abstractC20745.mo33991());
        if (c4695 != null && !c4695.equals(c4696)) {
            throw new C8599();
        }
        C10204 c10204M19649 = m19648(str, false);
        if (str3.equals(c10204M19649.f34854)) {
            AbstractC20745 abstractC20746 = c10204M19649.f34853;
            if (abstractC20746.mo33988() && abstractC20746.mo33971() && abstractC20746.mo33964() == c4696.m13012() && abstractC20746.mo33991() == c4696.m13010()) {
                return new C7381(str, c10204M19649, c4696);
            }
        }
        throw new C8599();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4695 m19644(AbstractC20745 abstractC20745, C4695 c4695) throws IOException {
        if (!(abstractC20745 instanceof C14042)) {
            if (!abstractC20745.mo33988() || !abstractC20745.mo33971()) {
                throw new IOException("Hex target metadata is unavailable");
            }
            long jMo33964 = abstractC20745.mo33964();
            long jMo33991 = abstractC20745.mo33991();
            if (jMo33964 < 0 || ((jMo33964 == 0 && c4695.m13012() != 0) || (jMo33991 == 0 && c4695.m13010() != 0))) {
                throw new IOException("Hex target metadata is unavailable");
            }
            return new C4695(jMo33964, jMo33991);
        }
        C5574 c5574M33984 = ((C14042) abstractC20745).m33984();
        if (c5574M33984.m15393() != '-' || c5574M33984.m15391() < 0) {
            throw new IOException("Hex target metadata is unavailable");
        }
        return new C4695(c5574M33984.m15391(), c5574M33984.m15394());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7381 m19653() {
        if (this.f24486) {
            return this;
        }
        return m19645(this.f24485, this.f24487, (C4695) null);
    }
}
