package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1225 implements InterfaceC7588 {
    @Override // 
    /* JADX INFO: renamed from: clone */
    public abstract AbstractC1225 mo2316clone();

    public abstract AbstractC1225 internalMergeFrom(AbstractC9427 abstractC9427);

    @Override // l.InterfaceC7588
    public abstract AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215);

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4454mergeFrom(byte[] bArr, int i, int i2) throws C20463 {
        try {
            AbstractC3660 abstractC3660M11872 = AbstractC3660.m11872(false, i, i2, bArr);
            mo4451mergeFrom(abstractC3660M11872);
            abstractC3660M11872.mo11879(0);
            return this;
        } catch (C20463 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m4444("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4455mergeFrom(byte[] bArr, int i, int i2, C24215 c24215) throws C20463 {
        try {
            AbstractC3660 abstractC3660M11872 = AbstractC3660.m11872(false, i, i2, bArr);
            mergeFrom(abstractC3660M11872, c24215);
            abstractC3660M11872.mo11879(0);
            return this;
        } catch (C20463 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m4444("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4451mergeFrom(AbstractC3660 abstractC3660) {
        return mergeFrom(abstractC3660, C24215.m54206());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4452mergeFrom(AbstractC17084 abstractC17084) throws C20463 {
        try {
            AbstractC3660 abstractC3660Mo29725 = abstractC17084.mo29725();
            mo4451mergeFrom(abstractC3660Mo29725);
            abstractC3660Mo29725.mo11879(0);
            return this;
        } catch (C20463 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m4444("ByteString"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4453mergeFrom(AbstractC17084 abstractC17084, C24215 c24215) throws C20463 {
        try {
            AbstractC3660 abstractC3660Mo29725 = abstractC17084.mo29725();
            mergeFrom(abstractC3660Mo29725, c24215);
            abstractC3660Mo29725.mo11879(0);
            return this;
        } catch (C20463 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m4444("ByteString"), e2);
        }
    }

    @Override // l.InterfaceC7588
    public AbstractC1225 mergeFrom(byte[] bArr) {
        return mo4454mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4456mergeFrom(byte[] bArr, C24215 c24215) {
        return mo4455mergeFrom(bArr, 0, bArr.length, c24215);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4449mergeFrom(InputStream inputStream) {
        AbstractC3660 abstractC3660M11871 = AbstractC3660.m11871(inputStream);
        mo4451mergeFrom(abstractC3660M11871);
        abstractC3660M11871.mo11879(0);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC1225 mo4450mergeFrom(InputStream inputStream, C24215 c24215) {
        AbstractC3660 abstractC3660M11871 = AbstractC3660.m11871(inputStream);
        mergeFrom(abstractC3660M11871, c24215);
        abstractC3660M11871.mo11879(0);
        return this;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, C24215 c24215) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mo4450mergeFrom((InputStream) new C10173(inputStream, AbstractC3660.m11869(inputStream, i)), c24215);
        return true;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C24215.m54206());
    }

    @Override // l.InterfaceC7588
    public AbstractC1225 mergeFrom(InterfaceC18775 interfaceC18775) {
        if (!getDefaultInstanceForType().getClass().isInstance(interfaceC18775)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return internalMergeFrom((AbstractC9427) interfaceC18775);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m4444(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m4448(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 >= size) {
                        list.remove(size2);
                    } else {
                        throw new NullPointerException(str);
                    }
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24128 m4445(InterfaceC18775 interfaceC18775) {
        return new C24128();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4446(Iterable iterable, Collection collection) {
        m4447(iterable, (List) collection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4447(Iterable iterable, List list) {
        byte[] bArr = C23447.f75887;
        iterable.getClass();
        if (iterable instanceof InterfaceC9274) {
            List listMo4029 = ((InterfaceC9274) iterable).mo4029();
            InterfaceC9274 interfaceC9274 = (InterfaceC9274) list;
            int size = list.size();
            for (Object obj : listMo4029) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC9274.size() - size) + " is null.";
                    int size2 = interfaceC9274.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            interfaceC9274.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (obj instanceof AbstractC17084) {
                    interfaceC9274.mo4028((AbstractC17084) obj);
                } else {
                    interfaceC9274.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC24917) {
            list.addAll((Collection) iterable);
        } else {
            m4448(iterable, list);
        }
    }
}
