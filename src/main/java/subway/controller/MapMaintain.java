package subway.controller;

import subway.domain.LineRepository;

import java.util.Scanner;

public class MapMaintain {

    public MapMaintain(Scanner scanner) {
        map();
        new Controller(scanner);
    }

    private void map() {
        LineRepository.allStatus();
    }
}
