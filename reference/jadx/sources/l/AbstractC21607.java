package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21607 implements InterfaceC6977 {
    @Override // 
    /* JADX INFO: renamed from: clone */
    public abstract AbstractC21607 mo2780clone();

    public abstract AbstractC21607 internalMergeFrom(AbstractC18079 abstractC18079);

    @Override // l.InterfaceC6977
    public abstract AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701);

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11458mergeFrom(byte[] bArr, int i, int i2) throws C4529 {
        try {
            AbstractC3262 abstractC3262M9743 = AbstractC3262.m9743(false, i, i2, bArr);
            mo11455mergeFrom(abstractC3262M9743);
            abstractC3262M9743.mo6025(0);
            return this;
        } catch (C4529 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m48312("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11459mergeFrom(byte[] bArr, int i, int i2, C2701 c2701) throws C4529 {
        try {
            AbstractC3262 abstractC3262M9743 = AbstractC3262.m9743(false, i, i2, bArr);
            mergeFrom(abstractC3262M9743, c2701);
            abstractC3262M9743.mo6025(0);
            return this;
        } catch (C4529 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m48312("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11455mergeFrom(AbstractC3262 abstractC3262) {
        return mergeFrom(abstractC3262, C2701.m8236());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11456mergeFrom(AbstractC23725 abstractC23725) throws C4529 {
        try {
            AbstractC3262 abstractC3262Mo16491 = abstractC23725.mo16491();
            mo11455mergeFrom(abstractC3262Mo16491);
            abstractC3262Mo16491.mo6025(0);
            return this;
        } catch (C4529 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m48312("ByteString"), e2);
        }
    }

    @Override // l.InterfaceC22500
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11457mergeFrom(AbstractC23725 abstractC23725, C2701 c2701) throws C4529 {
        try {
            AbstractC3262 abstractC3262Mo16491 = abstractC23725.mo16491();
            mergeFrom(abstractC3262Mo16491, c2701);
            abstractC3262Mo16491.mo6025(0);
            return this;
        } catch (C4529 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m48312("ByteString"), e2);
        }
    }

    @Override // l.InterfaceC6977
    public AbstractC21607 mergeFrom(byte[] bArr) {
        return mo11458mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11460mergeFrom(byte[] bArr, C2701 c2701) {
        return mo11459mergeFrom(bArr, 0, bArr.length, c2701);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11453mergeFrom(InputStream inputStream) {
        AbstractC3262 abstractC3262M9742 = AbstractC3262.m9742(inputStream);
        mo11455mergeFrom(abstractC3262M9742);
        abstractC3262M9742.mo6025(0);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC21607 mo11454mergeFrom(InputStream inputStream, C2701 c2701) {
        AbstractC3262 abstractC3262M9742 = AbstractC3262.m9742(inputStream);
        mergeFrom(abstractC3262M9742, c2701);
        abstractC3262M9742.mo6025(0);
        return this;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, C2701 c2701) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mo11454mergeFrom((InputStream) new C15258(inputStream, AbstractC3262.m9740(inputStream, i)), c2701);
        return true;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C2701.m8236());
    }

    @Override // l.InterfaceC6977
    public AbstractC21607 mergeFrom(InterfaceC23206 interfaceC23206) {
        if (!getDefaultInstanceForType().getClass().isInstance(interfaceC23206)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return internalMergeFrom((AbstractC18079) interfaceC23206);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m48312(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m48316(Iterable iterable, List list) {
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
    public static C2474 m48313(InterfaceC23206 interfaceC23206) {
        return new C2474();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48314(Iterable iterable, Collection collection) {
        m48315(iterable, (List) collection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48315(Iterable iterable, List list) {
        byte[] bArr = C9779.f33478;
        iterable.getClass();
        if (iterable instanceof InterfaceC17935) {
            List listMo21385 = ((InterfaceC17935) iterable).mo21385();
            InterfaceC17935 interfaceC17935 = (InterfaceC17935) list;
            int size = list.size();
            for (Object obj : listMo21385) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC17935.size() - size) + " is null.";
                    int size2 = interfaceC17935.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            interfaceC17935.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (obj instanceof AbstractC23725) {
                    interfaceC17935.mo21383((AbstractC23725) obj);
                } else {
                    interfaceC17935.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC11211) {
            list.addAll((Collection) iterable);
        } else {
            m48316(iterable, list);
        }
    }
}
