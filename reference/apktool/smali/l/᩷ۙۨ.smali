.class public final Ll/᩷ۙۨ;
.super Ljava/lang/Object;
.source "2BMB"


# static fields
.field public static final ᩷:Ll/ۙۙۨ;


# instance fields
.field public final ۙ:Ll/۬᩷ۤ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 480
    new-instance v0, Ll/ۙۙۨ;

    .line 468
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 480
    sput-object v0, Ll/᩷ۙۨ;->᩷:Ll/ۙۙۨ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/۬᩷ۤ;)V
    .locals 0

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۙۨ;->ۙ:Ll/۬᩷ۤ;

    return-void
.end method

.method public static final synthetic ۙ()Ll/ۙۙۨ;
    .locals 1

    .line 413
    sget-object v0, Ll/᩷ۙۨ;->᩷:Ll/ۙۙۨ;

    return-object v0
.end method

.method public static final synthetic ۙ(Ll/۬᩷ۤ;)Ll/᩷ۙۨ;
    .locals 1

    .line 0
    new-instance v0, Ll/᩷ۙۨ;

    invoke-direct {v0, p0}, Ll/᩷ۙۨ;-><init>(Ll/۬᩷ۤ;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 0
    instance-of v0, p1, Ll/᩷ۙۨ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ll/᩷ۙۨ;

    iget-object p1, p1, Ll/᩷ۙۨ;->ۙ:Ll/۬᩷ۤ;

    .line 169
    iget-object v0, p0, Ll/᩷ۙۨ;->ۙ:Ll/۬᩷ۤ;

    invoke-virtual {v0, p1}, Ll/۬᩷ۤ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩷ۙۨ;->ۙ:Ll/۬᩷ۤ;

    .line 0
    invoke-virtual {v0}, Ll/۬᩷ۤ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 497
    iget-object v0, p0, Ll/᩷ۙۨ;->ۙ:Ll/۬᩷ۤ;

    .line 498
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Value("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
