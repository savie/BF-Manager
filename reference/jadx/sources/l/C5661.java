package l;

import android.text.TextUtils;
import bin.mt.plus.Main;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۚ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5661 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IInArchive m16647(AbstractC22044 abstractC22044, Consumer consumer) throws Throwable {
        IInStream c2953;
        if (!C25053.m55879()) {
            throw new SevenZipException(C25053.m55880());
        }
        C19831 c19831 = new C19831(C21054.m48109(abstractC22044.mo4294()), consumer);
        IInArchive iInArchiveM56782 = null;
        try {
            C16912 c16912M41323 = C17658.m41323(abstractC22044.getName());
            if (c16912M41323 != null && c16912M41323.m39898() == EnumC25118.SEVEN_ZIP) {
                c2953 = m16649(abstractC22044, consumer);
            } else if (abstractC22044.getName().matches(".*\\.part[0-9]+\\.rar")) {
                String name = abstractC22044.getName();
                if (!name.toLowerCase().endsWith(".part1.rar")) {
                    AbstractC22044 abstractC22044M49868 = abstractC22044.m49868(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                    if (abstractC22044M49868.mo2934()) {
                        abstractC22044 = abstractC22044M49868;
                    }
                }
                c2953 = c19831.getStream(abstractC22044.mo4294());
            } else {
                consumer.n(abstractC22044);
                c2953 = new C2953(abstractC22044);
            }
            try {
                iInArchiveM56782 = SevenZip.m56782((C2953) c2953, c19831);
                iInArchiveM56782.addAutoCloseable(c2953);
                iInArchiveM56782.addAutoCloseable(c19831);
                iInArchiveM56782.setFileName(abstractC22044.getName());
                iInArchiveM56782.setFileSize(abstractC22044.mo4285());
                iInArchiveM56782.setFileTime(abstractC22044.mo4286());
                return iInArchiveM56782;
            } catch (Throwable th) {
                th = th;
                C20244.m46520(iInArchiveM56782);
                C20244.m46520(c2953);
                C20244.m46520(c19831);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2953 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16648(Main main, AbstractC22044 abstractC22044, final InterfaceC13118 interfaceC13118) {
        Closeable c2953;
        if (!C25053.m55879()) {
            throw new SevenZipException(C25053.m55880());
        }
        C15355 c15355 = new C15355(main, interfaceC13118);
        c15355.m47258(C21054.m48109(abstractC22044.mo4294()));
        c15355.m47256(new BooleanSupplier() { // from class: l.ۤ۫᩸
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return interfaceC13118.mo924();
            }
        });
        while (true) {
            try {
                C16912 c16912M41323 = C17658.m41323(abstractC22044.getName());
                if (c16912M41323 != null && c16912M41323.m39898() == EnumC25118.SEVEN_ZIP) {
                    c2953 = m16649(abstractC22044, new C22815(0, interfaceC13118));
                } else if (abstractC22044.getName().matches(".*\\.part[0-9]+\\.rar")) {
                    String name = abstractC22044.getName();
                    if (!name.toLowerCase().endsWith(".part1.rar")) {
                        AbstractC22044 abstractC22044M49868 = abstractC22044.m49868(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                        if (abstractC22044M49868.mo2934()) {
                            abstractC22044 = abstractC22044M49868;
                        }
                    }
                    c2953 = c15355.getStream(abstractC22044.mo4294());
                } else {
                    interfaceC13118.mo20515(abstractC22044);
                    c2953 = new C2953(abstractC22044);
                }
                try {
                    try {
                        IInArchive iInArchiveM56782 = SevenZip.m56782((C2953) c2953, c15355);
                        iInArchiveM56782.setFileName(abstractC22044.getName());
                        iInArchiveM56782.setFileSize(abstractC22044.mo4285());
                        iInArchiveM56782.setFileTime(abstractC22044.mo4286());
                        iInArchiveM56782.addAutoCloseable(c2953);
                        iInArchiveM56782.addAutoCloseable(c15355);
                        if (c15355.m47260()) {
                            String strM47255 = c15355.m47255();
                            if (!TextUtils.isEmpty(strM47255)) {
                                C21054.m48119(abstractC22044.mo4294(), strM47255);
                            }
                        }
                        if (c15355.m47257()) {
                            C18902.m43875(c15355.m47255(), abstractC22044.mo4294());
                        }
                        interfaceC13118.mo20516(iInArchiveM56782);
                        return;
                    } catch (SevenZipException e) {
                        if (c15355.mo4531()) {
                            interfaceC13118.mo20517();
                            C20244.m46520(c2953);
                            c15355.m38347();
                            c15355.close();
                            return;
                        }
                        if (interfaceC13118.mo924()) {
                            throw e;
                        }
                        if (c15355.m47260()) {
                            if (c15355.m47259()) {
                                C18902.m43874();
                            }
                            c15355.m47258(null);
                            try {
                                C20244.m46520(c2953);
                                c15355.m38347();
                            } catch (Throwable th) {
                                c15355.close();
                                throw th;
                            }
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        C20244.m46520(null);
                    } else {
                        C20244.m46520(c2953);
                        c15355.m38347();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c2953 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m16646(AbstractC22044 abstractC22044) {
        C16912 c16912M41323 = C17658.m41323(abstractC22044.getName());
        if (c16912M41323 == null || c16912M41323.m39898() != EnumC25118.SEVEN_ZIP) {
            return null;
        }
        AbstractC22044 abstractC22044M49858 = abstractC22044.m49858();
        if (abstractC22044M49858 == null) {
            return Collections.singletonList(abstractC22044);
        }
        ArrayList arrayList = new ArrayList();
        String name = abstractC22044.getName();
        int i = Integer.parseInt(name.substring(name.length() - 3));
        String strM5124 = C1402.m5124(3, 0, name);
        for (int i2 = 1; i2 <= 999; i2++) {
            if (i2 != i) {
                AbstractC22044 abstractC22044M49876 = abstractC22044M49858.m49876(String.format(Locale.ENGLISH, "%s%03d", strM5124, Integer.valueOf(i2)));
                if (!abstractC22044M49876.mo4304()) {
                    if (i2 >= i) {
                        break;
                    }
                    arrayList.clear();
                    break;
                }
                arrayList.add(abstractC22044M49876);
            } else {
                arrayList.add(abstractC22044);
            }
        }
        return arrayList.size() > 1 ? arrayList : Collections.singletonList(abstractC22044);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2953 m16649(AbstractC22044 abstractC22044, Consumer consumer) {
        List listM16646 = m16646(abstractC22044);
        if (listM16646 == null) {
            throw new IllegalArgumentException("Not a split 7z file");
        }
        Iterator it = listM16646.iterator();
        while (it.hasNext()) {
            consumer.n((AbstractC22044) it.next());
        }
        if (listM16646.size() == 1) {
            return new C2953(abstractC22044);
        }
        C21982 c21982 = new C21982(listM16646.size());
        Iterator it2 = listM16646.iterator();
        while (it2.hasNext()) {
            c21982.add(((AbstractC22044) it2.next()).mo4285());
        }
        return new C2953(C11746.m29495(C20697.m47332(abstractC22044.getName(), c21982.m32835(), new C21151(listM16646))));
    }
}
