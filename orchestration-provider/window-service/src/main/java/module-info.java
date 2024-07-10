import dev.ikm.orchestration.interfaces.StaticMenuProvider;
import dev.ikm.orchestration.interfaces.WindowMenuProvider;
import dev.ikm.orchestration.provider.WindowServiceStaticMenuProvider;

module dev.ikm.orchestration.provider.window.service {
    requires dev.ikm.komet.details;
    requires dev.ikm.komet.framework;
    requires dev.ikm.komet.list;
    requires dev.ikm.komet.navigator;
    requires dev.ikm.komet.preferences;
    requires dev.ikm.komet.progress;
    requires dev.ikm.komet.search;
    requires dev.ikm.orchestration.interfaces;
    requires dev.ikm.tinkar.common;
    requires javafx.controls;
    requires javafx.graphics;
    requires org.eclipse.collections;
    requires org.eclipse.collections.api;
    requires org.slf4j;

    provides WindowMenuProvider with WindowServiceStaticMenuProvider;
}