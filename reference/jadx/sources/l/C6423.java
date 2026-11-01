package l;

import android.text.TextUtils;
import bin.mt.plus.Main;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۜ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6423 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IInArchive m17602(AbstractC20745 abstractC20745, Consumer consumer) throws Throwable {
        IInStream c17738;
        if (!C21240.m47723()) {
            throw new SevenZipException(C21240.m47722());
        }
        C0778 c0778 = new C0778(C11088.m27967(abstractC20745.mo33986()), consumer);
        IInArchive iInArchiveM52885 = null;
        try {
            if (abstractC20745.getName().matches("(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
                c17738 = m17604(abstractC20745, consumer);
            } else if (abstractC20745.getName().matches(".*\\.part[0-9]+\\.rar")) {
                String name = abstractC20745.getName();
                if (!name.toLowerCase().endsWith(".part1.rar")) {
                    AbstractC20745 abstractC20745M46706 = abstractC20745.m46706(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                    if (abstractC20745M46706.mo33975()) {
                        abstractC20745 = abstractC20745M46706;
                    }
                }
                c17738 = c0778.getStream(abstractC20745.mo33986());
            } else {
                consumer.n(abstractC20745);
                c17738 = new C17738(abstractC20745);
            }
            try {
                iInArchiveM52885 = SevenZip.m52885((C17738) c17738, c0778);
                iInArchiveM52885.addAutoCloseable(c17738);
                iInArchiveM52885.addAutoCloseable(c0778);
                iInArchiveM52885.setFileName(abstractC20745.getName());
                iInArchiveM52885.setFileSize(abstractC20745.mo33964());
                iInArchiveM52885.setFileTime(abstractC20745.mo33991());
                return iInArchiveM52885;
            } catch (Throwable th) {
                th = th;
                C19431.m44468(iInArchiveM52885);
                C19431.m44468(c17738);
                C19431.m44468(c0778);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c17738 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17603(Main main, AbstractC20745 abstractC20745, final InterfaceC3600 interfaceC3600) {
        Closeable c17738;
        if (!C21240.m47723()) {
            throw new SevenZipException(C21240.m47722());
        }
        C12774 c12774 = new C12774(main, interfaceC3600);
        c12774.m26747(C11088.m27967(abstractC20745.mo33986()));
        c12774.m26746(new BooleanSupplier() { // from class: l.ۚ֨ۖ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return interfaceC3600.mo2357();
            }
        });
        while (true) {
            try {
                if (abstractC20745.getName().matches("(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
                    c17738 = m17604(abstractC20745, new Consumer() { // from class: l.᩹֨ۖ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            interfaceC3600.mo10686((AbstractC20745) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }
                    });
                } else if (abstractC20745.getName().matches(".*\\.part[0-9]+\\.rar")) {
                    String name = abstractC20745.getName();
                    if (!name.toLowerCase().endsWith(".part1.rar")) {
                        AbstractC20745 abstractC20745M46706 = abstractC20745.m46706(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                        if (abstractC20745M46706.mo33975()) {
                            abstractC20745 = abstractC20745M46706;
                        }
                    }
                    c17738 = c12774.getStream(abstractC20745.mo33986());
                } else {
                    interfaceC3600.mo10686(abstractC20745);
                    c17738 = new C17738(abstractC20745);
                }
                try {
                    try {
                        IInArchive iInArchiveM52885 = SevenZip.m52885((C17738) c17738, c12774);
                        iInArchiveM52885.setFileName(abstractC20745.getName());
                        iInArchiveM52885.setFileSize(abstractC20745.mo33964());
                        iInArchiveM52885.setFileTime(abstractC20745.mo33991());
                        iInArchiveM52885.addAutoCloseable(c17738);
                        iInArchiveM52885.addAutoCloseable(c12774);
                        if (c12774.m26749()) {
                            String strM26750 = c12774.m26750();
                            if (!TextUtils.isEmpty(strM26750)) {
                                C11088.m27975(abstractC20745.mo33986(), strM26750);
                            }
                        }
                        if (c12774.m26745()) {
                            C19808.m45037(c12774.m26750(), abstractC20745.mo33986());
                        }
                        interfaceC3600.mo10687(iInArchiveM52885);
                        return;
                    } catch (SevenZipException e) {
                        if (c12774.mo26748()) {
                            interfaceC3600.mo10688();
                            C19431.m44468(c17738);
                            c12774.m22115();
                            c12774.close();
                            return;
                        }
                        if (interfaceC3600.mo2357()) {
                            throw e;
                        }
                        if (c12774.m26749()) {
                            if (c12774.m26751()) {
                                C19808.m45036();
                            }
                            c12774.m26747(null);
                            try {
                                C19431.m44468(c17738);
                                c12774.m22115();
                            } catch (Throwable th) {
                                c12774.close();
                                throw th;
                            }
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        C19431.m44468(null);
                    } else {
                        C19431.m44468(c17738);
                        c12774.m22115();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c17738 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17738 m17604(AbstractC20745 abstractC20745, Consumer consumer) {
        int i;
        AbstractC20745 abstractC20745M46689 = abstractC20745.m46689();
        if (abstractC20745M46689 == null) {
            return new C17738(abstractC20745);
        }
        ArrayList arrayList = new ArrayList();
        C16916 c16916 = new C16916();
        String name = abstractC20745.getName();
        int i2 = Integer.parseInt(name.substring(name.length() - 3));
        String strM46498 = C20630.m46498(3, 0, name);
        int i3 = 1;
        while (true) {
            i = 2;
            if (i3 > 999) {
                break;
            }
            if (i3 != i2) {
                AbstractC20745 abstractC20745M46690 = abstractC20745M46689.m46690(String.format(Locale.ENGLISH, "%s%03d", strM46498, Integer.valueOf(i3)));
                if (!abstractC20745M46690.mo33971()) {
                    if (i3 >= i2) {
                        break;
                    }
                    arrayList.clear();
                    c16916.clear();
                    break;
                }
                c16916.add(abstractC20745M46690.mo33964());
                arrayList.add(abstractC20745M46690);
            } else {
                c16916.add(abstractC20745.mo33964());
                arrayList.add(abstractC20745);
            }
            i3++;
        }
        if (c16916.size() <= 1) {
            consumer.n(abstractC20745);
            return new C17738(abstractC20745);
        }
        c16916.m39602();
        arrayList.trimToSize();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            consumer.n((AbstractC20745) it.next());
        }
        return new C17738(C19734.m44887(C0682.m3047(name, c16916.m52323(), new C15101(i, arrayList))));
    }
}
