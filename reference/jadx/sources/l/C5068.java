package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes3.dex */
public class C5068 implements InterfaceC9629, AutoCloseable {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final InputFilter[] f17657 = new InputFilter[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputFilter[] f17658;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11538 f17659;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile int f17660;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f17661;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.ReadLock f17662;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f17663;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f17664;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f17665;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18186 f17666;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C11033 f17667;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17668;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f17669;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6560 f17670;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12965 f17671;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17672;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C17505 f17673;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.WriteLock f17674;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18186 m15347() {
        return this.f17666;
    }

    public C5068() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f17665 = reentrantReadWriteLock;
        this.f17662 = reentrantReadWriteLock.readLock();
        this.f17674 = reentrantReadWriteLock.writeLock();
        this.f17666 = new C7393(this);
        this.f17658 = f17657;
        C21697.m49248(0, 0, 0);
        this.f17673 = null;
        C6560 c6560 = new C6560("");
        this.f17670 = c6560;
        c6560.m18476(new C3576(0, 0, "", 0, 0), null);
        this.f17667 = new C11033(this, "", 0);
    }

    public C5068(C17505 c17505) {
        this(c17505, null);
    }

    public C5068(C17505 c17505, CharSequence charSequence) {
        C11033 c11033;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f17665 = reentrantReadWriteLock;
        this.f17662 = reentrantReadWriteLock.readLock();
        this.f17674 = reentrantReadWriteLock.writeLock();
        this.f17666 = new C7393(this);
        this.f17658 = f17657;
        this.f17673 = c17505;
        this.f17670 = null;
        if (charSequence == null) {
            c11033 = new C11033(this, null, 0);
        } else {
            c11033 = new C11033(this, charSequence, charSequence.length());
        }
        this.f17667 = c11033;
        C21498 c21498M41103 = c17505.m41103();
        this.f17661 = true;
        try {
            if (c21498M41103.m48908() >= 0) {
                setSpan(Selection.SELECTION_START, c21498M41103.m48908(), c21498M41103.m48908(), 34);
            }
            if (c21498M41103.m48906() >= 0) {
                setSpan(Selection.SELECTION_END, c21498M41103.m48906(), c21498M41103.m48906(), 34);
            }
        } finally {
            this.f17661 = false;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7305 m15346() {
        m15336();
        C17505 c17505 = this.f17673;
        return c17505 == null ? this.f17670.m18474() : c17505.m41121();
    }

    @Override // l.InterfaceC9629
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C15508 mo15350() {
        return m15333(false);
    }

    @Override // l.InterfaceC9629
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15508 mo15337() {
        return m15333(true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C15508 m15333(boolean z) {
        C17505 c17505;
        this.f17662.lock();
        try {
            if (this.f17664 != 0) {
                throw new IllegalStateException("Text replacement is not published");
            }
            m15336();
            C7305 c7305M15346 = (!z || (c17505 = this.f17673) == null) ? m15346() : c17505.m41083();
            int i = this.f17660;
            this.f17662.unlock();
            return C15508.m37164(c7305M15346, i);
        } catch (Throwable th) {
            this.f17662.unlock();
            throw th;
        }
    }

    @Override // l.InterfaceC9629
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15342(C15508 c15508) {
        C7305 c7305M37178 = c15508 == null ? null : c15508.m37178();
        boolean z = false;
        if (c7305M37178 == null) {
            return false;
        }
        this.f17662.lock();
        try {
            if (!this.f17669 && this.f17664 == 0 && c15508.m37177() == this.f17660) {
                C17505 c17505 = this.f17673;
                if (c17505 == null) {
                    if (this.f17670.m18477(c7305M37178)) {
                        z = true;
                    }
                } else if (c17505.m41099(c7305M37178)) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f17662.unlock();
        }
    }

    /* JADX INFO: renamed from: ֨ۙ */
    public EnumC1844 mo11033() {
        return m15335(false);
    }

    /* JADX INFO: renamed from: ۟ۙ */
    public EnumC1844 mo11041() {
        return m15335(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15354(Runnable runnable) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        writeLock.lock();
        try {
            m15336();
            C17505 c17505 = this.f17673;
            if (c17505 == null) {
                throw new IllegalStateException("History requires a text session");
            }
            int i = this.f17663;
            if (i != 0 || this.f17668 != 0) {
                throw new IllegalStateException("Cannot group history during text callbacks");
            }
            this.f17663 = i + 1;
            try {
                m15349();
                c17505.m41090(runnable);
                this.f17663--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f17663--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo11047() {
        return hashCode();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private EnumC1844 m15335(boolean z) {
        EnumC1844 enumC1844M41086;
        this.f17674.lock();
        try {
            if (this.f17669) {
                enumC1844M41086 = EnumC1844.UNAVAILABLE;
            } else {
                m15336();
                if (this.f17673 == null) {
                    throw new IllegalStateException("History requires a text session");
                }
                int i = this.f17663;
                if (i != 0 || this.f17668 != 0) {
                    throw new IllegalStateException("Cannot replay history during text callbacks");
                }
                this.f17663 = i + 1;
                try {
                    m15349();
                    enumC1844M41086 = this.f17673.m41086(z, new C14104(this));
                    this.f17663--;
                } catch (Throwable th) {
                    this.f17663--;
                    throw th;
                }
            }
            this.f17674.unlock();
            return enumC1844M41086;
        } catch (Throwable th2) {
            this.f17674.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11039(boolean z) {
        close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15340(C17505 c17505) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        writeLock.lock();
        try {
            m15336();
            if (this.f17673 != c17505) {
                throw new IllegalArgumentException("Text batch belongs to another session");
            }
            if (this.f17668 != 0 || this.f17663 != 0) {
                throw new IllegalStateException("Cannot publish text load during callbacks");
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C21170 mo11035(C24482 c24482) {
        return c24482.m54750(this.f17666);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15343(C17505 c17505, C14784 c14784, char[] cArr, int i, C21170 c21170, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        writeLock.lock();
        try {
            m15340(c17505);
            return this.f17673.m41101(this.f17666, c14784, cArr, i, c21170, i2);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15339(C11538 c11538) {
        int length = length();
        C11538 c11539 = this.f17659;
        this.f17659 = c11538;
        this.f17668++;
        try {
            this.f17667.m27921(length, length, (CharSequence) CharBuffer.wrap(c11538.m29040(), 0, c11538.m29041()), 0, c11538.m29041(), true);
            this.f17667.getClass();
        } finally {
            this.f17659 = c11539;
            this.f17668--;
        }
    }

    @Override // l.InterfaceC9629
    public final void setSelection(int i) {
        setSelection(i, i);
    }

    @Override // l.InterfaceC9629
    public final void setSelection(int i, int i2) {
        this.f17674.lock();
        try {
            if (!this.f17669) {
                Selection.setSelection(this, Math.min(i, length()), Math.min(i2, length()));
            }
        } finally {
            this.f17674.unlock();
        }
    }

    @Override // android.text.Editable
    public C5068 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m15330(i, i2, charSequence, i3, i4, (C12965) null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15330(int i, int i2, CharSequence charSequence, int i3, int i4, C12965 c12965) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        if (this.f17669) {
            return;
        }
        int length = charSequence.length();
        if (this.f17669) {
            return;
        }
        if (i3 < 0 || i4 < i3 || i4 > length) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i3, ", end = ", ", length = ", i4);
            sbM5126.append(length);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int length2 = i4;
        for (InputFilter inputFilter : this.f17658) {
            if (this.f17669) {
                return;
            }
            CharSequence charSequenceFilter = inputFilter.filter(charSequence2, i5, length2, this, i, i2);
            if (this.f17669) {
                return;
            }
            if (charSequenceFilter != null) {
                charSequence2 = charSequenceFilter;
                length2 = charSequenceFilter.length();
                i5 = 0;
            }
        }
        writeLock.lock();
        try {
            if (!m15334()) {
                writeLock.unlock();
                return;
            }
            m15349();
            C21697.m49248(i, i2, length());
            C21697.m49249(length(), i2 - i, length2 - i5);
            this.f17668++;
            C12965 c12966 = this.f17671;
            C11538 c11538 = this.f17659;
            this.f17671 = c12965;
            this.f17659 = null;
            try {
                this.f17667.m27921(i, i2, charSequence2, i5, length2, false);
                this.f17667.getClass();
                this.f17671 = c12966;
                this.f17659 = c11538;
                this.f17668--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f17671 = c12966;
                this.f17659 = c11538;
                this.f17668--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // l.InterfaceC9629
    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final int mo15344() {
        return this.f17660;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m15345() {
        if (this.f17665.isWriteLockedByCurrentThread()) {
            return (this.f17668 == 0 && this.f17663 == 0) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.۠᩶᩸] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.ۖ᩶᩸] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15338(final int i, final int i2, final CharSequence charSequence, final int i3, final int i4) {
        this.f17664++;
        if (i != i2 || i3 != i4) {
            try {
                this.f17660++;
            } finally {
                this.f17664--;
            }
        }
        C17505 c17505 = this.f17673;
        if (c17505 == 0) {
            C6560 c6560 = this.f17670;
            c6560.getClass();
            c6560.m18476(new C3576(i, i2, charSequence, i3, i4), null);
        } else {
            C11538 c11538 = this.f17659;
            if (c11538 != null) {
                c17505.m41092(c11538);
            } else {
                C12965 c12965 = this.f17671;
                if (c12965 != null) {
                    c17505.m41093(c12965, (C2918) new Consumer() { // from class: l.ۖ᩶᩸
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C12525) obj).m31114(i, i2, charSequence, i3, i4);
                        }
                    });
                } else {
                    c17505.m41091((C8884) new Consumer() { // from class: l.۠᩶᩸
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C12525) obj).m31114(i, i2, charSequence, i3, i4);
                        }
                    });
                }
            }
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return replace(i, i, charSequence, i2, i3);
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        return replace(i, i2, "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15352(int i) {
        replace(0, i, "");
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final void append(CharSequence charSequence) {
        insert(length(), charSequence);
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable
    public final void clear() {
        m15352(length());
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        this.f17674.lock();
        try {
            if (!this.f17669) {
                if (inputFilterArr == null) {
                    throw new IllegalArgumentException();
                }
                this.f17658 = inputFilterArr;
            }
            this.f17674.unlock();
        } catch (Throwable th) {
            this.f17674.unlock();
            throw th;
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f17658;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        ReentrantReadWriteLock.ReadLock readLock = this.f17662;
        readLock.lock();
        try {
            m15331(i, i2, cArr, i3);
        } finally {
            readLock.unlock();
        }
    }

    @Override // l.InterfaceC9629
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo15353(int i, int i2, char[] cArr, int i3) {
        m15331(i, i2, cArr, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15331(int i, int i2, char[] cArr, int i3) {
        C7305 c7305M15329 = m15329();
        try {
            if (c7305M15329 != null) {
                c7305M15329.getChars(i, i2, cArr, i3);
            } else {
                int i4 = i2 - i;
                if (i < 0 || i2 < i || i3 < 0 || i4 > cArr.length - i3) {
                    throw new IndexOutOfBoundsException("Invalid character copy range");
                }
                Arrays.fill(cArr, i3, i4 + i3, (char) 0);
            }
            if (c7305M15329 != null) {
                c7305M15329.close();
            }
        } catch (Throwable th) {
            if (c7305M15329 != null) {
                try {
                    c7305M15329.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        try {
            if (this.f17669) {
                return (char) 0;
            }
            C17505 c17505 = this.f17673;
            if (c17505 == null) {
                C21697 c21697M18475 = this.f17670.m18475(i);
                C10046 c10046 = c21697M18475.f69247;
                try {
                    return c21697M18475.m49251(i);
                } finally {
                    if (c10046 != null) {
                        c10046.m25975();
                    }
                }
            }
            return c17505.m41085(i);
        } catch (C13271 e) {
            if (this.f17669) {
                return (char) 0;
            }
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        try {
            if (this.f17669) {
                return this.f17672;
            }
            C17505 c17505 = this.f17673;
            return c17505 == null ? this.f17670.length() : c17505.length();
        } catch (C13271 e) {
            if (!this.f17669) {
                throw e;
            }
            return this.f17672;
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // l.InterfaceC9629
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo15351(int i, int i2) {
        return ((String) subSequence(i, i2)).toString();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C7305 c7305M15329 = m15329();
        try {
            String str = c7305M15329 == null ? new String(new char[this.f17672]) : c7305M15329.toString();
            if (c7305M15329 != null) {
                c7305M15329.close();
            }
            return str;
        } catch (Throwable th) {
            if (c7305M15329 != null) {
                try {
                    c7305M15329.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        C11033 c11033 = this.f17667;
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        writeLock.lock();
        try {
            if (m15334()) {
                c11033.m27920();
                m15349();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        C11033 c11033 = this.f17667;
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        writeLock.lock();
        try {
            if (m15334()) {
                c11033.m27922(obj, i, i2, i3);
                m15349();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C11033 c11033 = this.f17667;
        ReentrantReadWriteLock.WriteLock writeLock = this.f17674;
        writeLock.lock();
        try {
            if (m15334()) {
                c11033.m27927(obj);
                m15349();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        Object[] objArrM27923;
        this.f17662.lock();
        try {
            if (this.f17669) {
                if (cls == null) {
                    cls = Object.class;
                }
                objArrM27923 = (Object[]) Array.newInstance((Class<?>) cls, 0);
            } else {
                objArrM27923 = this.f17667.m27923(i, i2, cls);
            }
            return objArrM27923;
        } finally {
            this.f17662.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        this.f17662.lock();
        try {
            if (!this.f17669) {
                return this.f17667.m27924(obj);
            }
            return -1;
        } finally {
            this.f17662.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        this.f17662.lock();
        try {
            if (!this.f17669) {
                return this.f17667.m27919(obj);
            }
            return -1;
        } finally {
            this.f17662.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        this.f17662.lock();
        try {
            if (!this.f17669) {
                return this.f17667.m27926(obj);
            }
            return 0;
        } finally {
            this.f17662.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        this.f17662.lock();
        try {
            return this.f17669 ? i2 : this.f17667.m27925(i, i2, cls);
        } finally {
            this.f17662.unlock();
        }
    }

    public final boolean equals(Object obj) {
        char cM52965;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5068 c5068 = (C5068) obj;
                C7305 c7305M15329 = m15329();
                try {
                    C7305 c7305M153210 = c5068.m15329();
                    try {
                        int length = c7305M15329 == null ? this.f17672 : c7305M15329.length();
                        if (length != (c7305M153210 == null ? c5068.f17672 : c7305M153210.length())) {
                            if (c7305M153210 != null) {
                                c7305M153210.close();
                            }
                            if (c7305M15329 != null) {
                                c7305M15329.close();
                                return false;
                            }
                        } else {
                            C23714 c23714Mo16945 = null;
                            C23714 c23714Mo16946 = c7305M15329 == null ? null : c7305M15329.mo16945(0);
                            if (c7305M153210 != null) {
                                try {
                                    c23714Mo16945 = c7305M153210.mo16945(0);
                                } catch (Throwable th) {
                                    if (c23714Mo16946 != null) {
                                        try {
                                            c23714Mo16946.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            if (c23714Mo16946 == null && c23714Mo16945 == null) {
                                if (c23714Mo16945 != null) {
                                    c23714Mo16945.close();
                                }
                                if (c23714Mo16946 != null) {
                                    c23714Mo16946.close();
                                }
                                if (c7305M153210 != null) {
                                    c7305M153210.close();
                                }
                                if (c7305M15329 != null) {
                                    c7305M15329.close();
                                    return true;
                                }
                            } else {
                                for (int i = 0; i < length; i++) {
                                    char cM52966 = c23714Mo16946 == null ? (char) 0 : c23714Mo16946.m52965();
                                    if (c23714Mo16945 == null) {
                                        cM52965 = 0;
                                    } else {
                                        try {
                                            cM52965 = c23714Mo16945.m52965();
                                        } catch (Throwable th3) {
                                            if (c23714Mo16945 != null) {
                                                try {
                                                    c23714Mo16945.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (cM52966 != cM52965) {
                                        if (c23714Mo16945 != null) {
                                            c23714Mo16945.close();
                                        }
                                        if (c23714Mo16946 != null) {
                                            c23714Mo16946.close();
                                        }
                                        if (c7305M153210 != null) {
                                            c7305M153210.close();
                                        }
                                        if (c7305M15329 != null) {
                                            c7305M15329.close();
                                            return false;
                                        }
                                    }
                                }
                                if (c23714Mo16945 != null) {
                                    c23714Mo16945.close();
                                }
                                if (c23714Mo16946 != null) {
                                    c23714Mo16946.close();
                                }
                                if (c7305M153210 != null) {
                                    c7305M153210.close();
                                }
                                if (c7305M15329 != null) {
                                    c7305M15329.close();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        if (c7305M153210 != null) {
                            try {
                                c7305M153210.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (c7305M15329 != null) {
                        try {
                            c7305M15329.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C7305 c7305M15329 = m15329();
        int iM52965 = 0;
        if (c7305M15329 == null) {
            if (c7305M15329 != null) {
                c7305M15329.close();
            }
            return 0;
        }
        try {
            C23714 c23714Mo16945 = c7305M15329.mo16945(0);
            while (c23714Mo16945.m52964()) {
                try {
                    iM52965 = (iM52965 * 31) + c23714Mo16945.m52965();
                } catch (Throwable th) {
                    try {
                        c23714Mo16945.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c23714Mo16945.close();
            c7305M15329.close();
            return iM52965;
        } catch (Throwable th3) {
            try {
                c7305M15329.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C10375 m15348() {
        return new C10375(this, -1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15349() {
        C17505 c17505 = this.f17673;
        if (c17505 == null || this.f17661) {
            return;
        }
        c17505.m41089(Selection.getSelectionStart(this), Selection.getSelectionEnd(this));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private boolean m15334() {
        if (this.f17669) {
            return false;
        }
        C17505 c17505 = this.f17673;
        if (c17505 == null || this.f17661) {
            return true;
        }
        c17505.m41112();
        return true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private C7305 m15329() {
        if (this.f17669) {
            return null;
        }
        try {
            return m15346();
        } catch (C13271 e) {
            if (this.f17669) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.text.Editable
    public final void insert(int i, CharSequence charSequence) {
        if (this.f17669) {
            return;
        }
        replace(i, i, charSequence, 0, charSequence.length());
    }

    @Override // android.text.Editable
    public final C5068 replace(int i, int i2, CharSequence charSequence) {
        return this.f17669 ? this : replace(i, i2, charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15341() {
        return this.f17669;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m15336() {
        if (this.f17669) {
            throw new C13271("Editable is closed");
        }
    }

    public void close() {
        this.f17674.lock();
        try {
            if (!this.f17669) {
                if (this.f17668 != 0 || this.f17663 != 0) {
                    throw new IllegalStateException("Cannot close during editable replacement");
                }
                C17505 c17505 = this.f17673;
                this.f17672 = c17505 == null ? this.f17670.length() : c17505.length();
                this.f17669 = true;
                C6560 c6560 = this.f17670;
                if (c6560 != null) {
                    c6560.close();
                }
            }
            this.f17674.unlock();
        } catch (Throwable th) {
            this.f17674.unlock();
            throw th;
        }
    }
}
