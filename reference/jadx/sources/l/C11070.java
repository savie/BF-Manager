package l;

import com.alipay.sdk.m.n.c;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۧܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11070 extends C9675 implements InterfaceC17419 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37571;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C12481 f37572;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f37573;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f37574;

    public C11070(boolean z, C12481 c12481) {
        super(z);
        this.f37572 = c12481;
        m23284();
        m23271();
        m39218();
    }

    @Override // l.InterfaceC17419
    public final C12481 getKey() {
        return this.f37572;
    }

    @Override // l.C9675, l.C20963, l.InterfaceC17419
    /* JADX INFO: renamed from: ۨ */
    public final int mo17115(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo17115(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo23286();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo23286();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ֨ */
    public final IOException mo17113() throws SocketException {
        String strM47142 = m47142();
        String strValueOf = String.valueOf(m47139());
        throw new SocketException(strM47142.contains(strValueOf) ? "FTP reply: ".concat(strM47142) : C7997.m21055("FTP reply ", strValueOf, ": ", strM47142));
    }

    @Override // l.InterfaceC17419
    public final String getPath() {
        return this.f37573;
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ۘ */
    public final String mo17114() {
        return this.f37574;
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo17116(String str) throws SocketException {
        if (AbstractC11462.m28608(str).equals(this.f37573)) {
            return true;
        }
        if (!C13571.m33171(m47136(EnumC17435.CWD, str))) {
            return false;
        }
        mo17117();
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27915(boolean z) {
        this.f37571 = z;
    }

    @Override // l.C9675, l.C16730
    /* JADX INFO: renamed from: ۚ */
    public final Socket mo24608(String str, String str2) {
        if (this.f37571) {
            Socket socket = this.f30727;
            if (socket instanceof SSLSocket ? ((SSLSocket) socket).getEnableSessionCreation() : false) {
                try {
                    m24606(false);
                    return super.mo24608(str, str2);
                } finally {
                    m24606(true);
                }
            }
        }
        return super.mo24608(str, str2);
    }

    @Override // l.C9675
    /* JADX INFO: renamed from: ܰ */
    public final void mo24610(Socket socket) throws IOException {
        boolean zM27913;
        if (this.f37571 && (socket instanceof SSLSocket)) {
            SSLSession session = ((SSLSocket) this.f30727).getSession();
            if (!session.isValid()) {
                throw new IOException("Invalid SSL Session");
            }
            try {
                try {
                    if (m27912(session, socket)) {
                        zM27913 = true;
                    } else {
                        e = null;
                        try {
                            zM27913 = m27913(session, socket);
                        } catch (ReflectiveOperationException e) {
                            if (e != null) {
                                e.addSuppressed(e);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            } catch (ReflectiveOperationException e3) {
                e = e3;
            }
            if (!zM27913) {
                throw new IOException("Invalid SSL Session");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27912(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object obj;
        Method declaredMethod;
        Method method;
        String strValueOf;
        SSLSessionContext sessionContext = sSLSession.getSessionContext();
        Class<?> superclass = sessionContext.getClass();
        Class<?> cls = Integer.TYPE;
        Class<?>[] clsArr = {String.class, cls};
        while (true) {
            obj = null;
            if (superclass == null) {
                declaredMethod = null;
                break;
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("getSession", clsArr);
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        Class<?> superclass2 = sessionContext.getClass();
        loop1: while (true) {
            if (superclass2 == null) {
                method = null;
                break;
            }
            Method[] declaredMethods = superclass2.getDeclaredMethods();
            int length = declaredMethods.length;
            for (int i = 0; i < length; i++) {
                method = declaredMethods[i];
                if ("putSession".equals(method.getName()) && method.getParameterTypes().length == 2) {
                    break loop1;
                }
            }
            superclass2 = superclass2.getSuperclass();
        }
        if (declaredMethod != null && method != null) {
            declaredMethod.setAccessible(true);
            method.setAccessible(true);
            SSLSessionContext sessionContext2 = sSLSession.getSessionContext();
            Object objInvoke = declaredMethod.invoke(sessionContext2, sSLSession.getPeerHost(), Integer.valueOf(sSLSession.getPeerPort()));
            if (objInvoke != null) {
                obj = objInvoke;
            } else {
                Class<?> superclass3 = sessionContext2.getClass();
                while (true) {
                    if (superclass3 != null) {
                        try {
                            Field declaredField = superclass3.getDeclaredField("sessionsByHostAndPort");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(sessionContext2);
                            Map map = obj2 instanceof Map ? (Map) obj2 : new HashMap();
                            HashSet hashSetM27911 = m27911(sSLSession);
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                try {
                                    Class<?> superclass4 = key.getClass();
                                    while (true) {
                                        if (superclass4 != null) {
                                            try {
                                                Field declaredField2 = superclass4.getDeclaredField(c.f);
                                                declaredField2.setAccessible(true);
                                                Object obj3 = declaredField2.get(key);
                                                if (obj3 != null) {
                                                    strValueOf = String.valueOf(obj3);
                                                    break;
                                                }
                                                strValueOf = null;
                                                break;
                                            } catch (NoSuchFieldException unused2) {
                                                superclass4 = superclass4.getSuperclass();
                                            }
                                        } else {
                                            throw new NoSuchFieldException(c.f);
                                        }
                                        strValueOf = null;
                                        break;
                                    }
                                } catch (NoSuchFieldException unused3) {
                                }
                                int iM27910 = m27910(entry.getKey());
                                if (strValueOf != null && iM27910 >= 0) {
                                    Iterator it = hashSetM27911.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            continue;
                                        } else if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                            Object objInvoke2 = declaredMethod.invoke(sessionContext2, strValueOf, Integer.valueOf(iM27910));
                                            if (objInvoke2 != null) {
                                                obj = objInvoke2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        } catch (NoSuchFieldException unused4) {
                            superclass3 = superclass3.getSuperclass();
                        }
                    } else {
                        throw new NoSuchFieldException("sessionsByHostAndPort");
                    }
                }
            }
            if (obj != null) {
                Constructor<?> declaredConstructor = method.getParameterTypes()[0].getDeclaredConstructor(String.class, cls);
                declaredConstructor.setAccessible(true);
                method.invoke(sessionContext, declaredConstructor.newInstance(socket.getInetAddress().getHostName(), Integer.valueOf(socket.getPort())), obj);
                method.invoke(sessionContext, declaredConstructor.newInstance(socket.getInetAddress().getHostAddress(), Integer.valueOf(socket.getPort())), obj);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m27913(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Object obj;
        String strValueOf;
        SSLSessionContext sessionContext = sSLSession.getSessionContext();
        for (Class<?> superclass = sessionContext.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("sessionsByHostAndPort");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(sessionContext);
                Map map = obj2 instanceof Map ? (Map) obj2 : new HashMap();
                if (!map.isEmpty()) {
                    HashSet hashSetM27911 = m27911(sSLSession);
                    int peerPort = sSLSession.getPeerPort();
                    Object obj3 = null;
                    for (Object obj4 : map.keySet()) {
                        try {
                            Class<?> superclass2 = obj4.getClass();
                            while (true) {
                                if (superclass2 != null) {
                                    try {
                                        Field declaredField2 = superclass2.getDeclaredField(c.f);
                                        declaredField2.setAccessible(true);
                                        Object obj5 = declaredField2.get(obj4);
                                        if (obj5 != null) {
                                            strValueOf = String.valueOf(obj5);
                                            break;
                                        }
                                        strValueOf = null;
                                        break;
                                    } catch (NoSuchFieldException unused) {
                                        superclass2 = superclass2.getSuperclass();
                                    }
                                } else {
                                    throw new NoSuchFieldException(c.f);
                                }
                                strValueOf = null;
                                break;
                            }
                        } catch (NoSuchFieldException unused2) {
                        }
                        int iM27910 = m27910(obj4);
                        if (strValueOf != null && iM27910 >= 0) {
                            Iterator it = hashSetM27911.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                    if (peerPort != iM27910) {
                                        if (obj3 != null) {
                                            break;
                                        }
                                        obj3 = obj4;
                                        break;
                                    }
                                    obj3 = obj4;
                                    break;
                                }
                            }
                        }
                    }
                    if (obj3 != null && (obj = map.get(obj3)) != null) {
                        Constructor<?> declaredConstructor = obj3.getClass().getDeclaredConstructor(String.class, Integer.TYPE);
                        declaredConstructor.setAccessible(true);
                        map.put(declaredConstructor.newInstance(socket.getInetAddress().getHostName(), Integer.valueOf(socket.getPort())), obj);
                        map.put(declaredConstructor.newInstance(socket.getInetAddress().getHostAddress(), Integer.valueOf(socket.getPort())), obj);
                        return true;
                    }
                }
                return false;
            } catch (NoSuchFieldException unused3) {
            }
        }
        throw new NoSuchFieldException("sessionsByHostAndPort");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashSet m27911(SSLSession sSLSession) {
        HashSet hashSet = new HashSet();
        String peerHost = sSLSession.getPeerHost();
        if (peerHost != null && !peerHost.isEmpty()) {
            hashSet.add(peerHost);
        }
        Socket socket = this.f30727;
        if (socket != null && socket.getInetAddress() != null) {
            String hostName = this.f30727.getInetAddress().getHostName();
            if (hostName != null && !hostName.isEmpty()) {
                hashSet.add(hostName);
            }
            String hostAddress = this.f30727.getInetAddress().getHostAddress();
            if (hostAddress != null && !hostAddress.isEmpty()) {
                hashSet.add(hostAddress);
            }
        }
        return hashSet;
    }

    @Override // l.C16730, l.InterfaceC17419
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo27914(String str) throws IOException {
        try {
            Field declaredField = C16730.class.getDeclaredField("۫");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this)).intValue() != 2) {
                throw new IOException("FTPS storeFileStream only supports binary file type");
            }
            Socket socketM39236 = m39236(EnumC17435.STOR, str);
            if (socketM39236 == null) {
                return null;
            }
            return new C13892(socketM39236, socketM39236.getOutputStream());
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to read FTP file type reflectively", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27910(Object obj) {
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField("port");
                    declaredField.setAccessible(true);
                    return ((Integer) declaredField.get(obj)).intValue();
                } catch (NoSuchFieldException unused) {
                }
            }
            throw new NoSuchFieldException("port");
        } catch (NoSuchFieldException unused2) {
            return -1;
        }
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ᩹ */
    public final String mo17117() throws SocketException {
        String strM17112 = m47136(EnumC17435.PWD, (String) null) != 257 ? null : C6130.m17112((String) C19084.m43861(this.f68303, 1));
        if (strM17112 == null) {
            mo17113();
            throw null;
        }
        String strM28608 = AbstractC11462.m28608(strM17112);
        this.f37573 = strM28608;
        if (this.f37574 == null) {
            this.f37574 = strM28608;
        }
        return strM17112;
    }
}
