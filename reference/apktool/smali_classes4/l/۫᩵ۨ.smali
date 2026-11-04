.class public abstract Ll/۫᩵ۨ;
.super Ll/ᩴ᩵ۨ;
.source "A7IO"


# instance fields
.field public ۤ:I

.field public ᩴ:I

.field public ᩸:Ll/ܳ᩵ۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    sget-object v0, Ll/᩺᩵ۨ;->ۤ:[Ll/ۨ۬᩹;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 131
    invoke-direct {p0, v0}, Ll/۠᩷᩻;-><init>(I)V

    const/16 v0, 0x2000

    .line 56
    iput v0, p0, Ll/۫᩵ۨ;->ۤ:I

    const v0, 0x7fffffff

    .line 66
    iput v0, p0, Ll/۫᩵ۨ;->ᩴ:I

    .line 71
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 76
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 83
    new-instance v0, Ll/ܳ᩵ۨ;

    invoke-direct {v0, p0}, Ll/ܳ᩵ۨ;-><init>(Ll/۫᩵ۨ;)V

    .line 88
    iput-object v0, p0, Ll/۫᩵ۨ;->᩸:Ll/ܳ᩵ۨ;

    return-void
.end method

.method public static ۙ(Ll/۫᩵ۨ;I)V
    .locals 3

    .line 83
    iget p0, p0, Ll/۫᩵ۨ;->ᩴ:I

    if-gt p1, p0, :cond_0

    return-void

    .line 426
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p0, v1, p1

    const-string p0, "Request %,d exceeds maximum %,d"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 104
    iget-object v0, p0, Ll/۫᩵ۨ;->᩸:Ll/ܳ᩵ۨ;

    iget-object v0, v0, Ll/ܳ᩵ۨ;->ܰ:Ll/۫᩵ۨ;

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Ll/۫᩵ۨ;->ۙ(Ll/۫᩵ۨ;I)V

    .line 306
    iput v1, p0, Ll/۫᩵ۨ;->ۤ:I

    return-void
.end method

.method public final ۚ()Ljava/io/InputStream;
    .locals 1

    .line 213
    invoke-virtual {p0}, Ll/ᩴ᩵ۨ;->ܳ()Ll/᩸᩵ۨ;

    move-result-object v0

    check-cast v0, Ll/ۤ᩵ۨ;

    .line 1198
    iget-object v0, v0, Ll/᩸᩵ۨ;->᩷:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ۫()I
    .locals 1

    .line 113
    iget v0, p0, Ll/۫᩵ۨ;->ۤ:I

    return v0
.end method
