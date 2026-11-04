.class public final Ll/ۡ۟ۗ;
.super Ljava/lang/Object;
.source "AIXM"


# instance fields
.field public final ۙ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۡ۟ۗ;->ۙ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۡ۟ۗ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/Integer;Ll/ܽۡۗ;)V
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۡ۟ۗ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
